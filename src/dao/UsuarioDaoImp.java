/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.Usuario;
import entidades.UsuarioContrasenia;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelas
 */
public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public List<Usuario> obtenerUsuarios() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<Usuario> usuarios = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try {
            usuarios = session.createCriteria(Usuario.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return usuarios;
    }

    @Override
    public Usuario obtenerUsuario(String usuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<Usuario> usuarios = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try{
            Query query = session.createQuery("from Usuario where usuario = :usuario ");
            query.setString("usuario", usuario);
            usuarios = query.list();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session!=null){
                session.close();
            }
           
        }
        return (usuarios.isEmpty())? null : usuarios.get(0);
    }

    @Override
    public Boolean verificarContraseña(Usuario usuario, String contrasenia) {
        Boolean contraseniaCorrecta=false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List list;
        Transaction tx = session.beginTransaction();
        try{
            Query query = session.createQuery("from UsuarioContrasenia where id_usuario = :usuario and contrasenia = :contrasenia");
            query.setInteger("usuario", usuario.getIdUsuario());
            query.setString("contrasenia", contrasenia);
            list = query.list();
            if(!list.isEmpty()){
                contraseniaCorrecta=true;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session.isOpen()){
                session.close();
            }
           
        }
        return contraseniaCorrecta;
    }

    @Override
    public Boolean agregarUsuario(Usuario usuario,UsuarioContrasenia contrasena) {
        Boolean exitoso=false;
        Integer registros=0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            registros=(Integer)session.save(usuario);
            contrasena.setIdUsuario(usuario.getIdUsuario());
            session.save(contrasena);
            System.out.println("Registros insertados: "+registros);
            tx.commit();
            exitoso=true;
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }finally{
            if(session.isOpen()){
                session.close();
            }
        }
        return exitoso;
    }

    @Override
    public Boolean modificarUsuario(Usuario usuario) {
        Boolean exitoso=false;
        Integer registros=0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            session.saveOrUpdate(usuario);
            System.out.println("Registros actualizados: "+registros);
            tx.commit();
            exitoso=true;
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }finally{
            if(session.isOpen()){
                session.close();
            }
        }
        return exitoso;
    }

    @Override
    public Boolean eliminarUsuario(int id) {
        Boolean exitoso=false;
        Integer registros=0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Usuario usuario = new Usuario();
        try {
            Object persistentInstance =session.load(Usuario.class, new Integer(id));
            session.delete(persistentInstance);
            System.out.println("Registros eliminados: "+registros);
            tx.commit();
            exitoso=true;
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }finally{
            if(session.isOpen()){
                session.close();
            }
        }
        return exitoso;
    }

}
