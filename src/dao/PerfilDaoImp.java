/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.Casilla;
import entidades.Perfil;
import entidades.Rol;
import entidades.SeccionalPerfil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelas
 */
public class PerfilDaoImp implements PerfilDao{

    @Override
    public List<Perfil> obtenerPersonalidades() {
          //Obtener la conexion a la base datos
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        //------------------------
        //Declaro mi lista del tipo de entidad que necesito
        List<Perfil> perfil=null;
        try{
            //Ejecuto mi query para obtener los resultados.
            perfil = session.createCriteria(Perfil.class).list();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
        //REtorna la lista
        return (perfil.isEmpty())?null : perfil;
    }

    @Override
    public Boolean agregarPersonalidad(Perfil perfil,Integer idSeccional,Integer idUsuario) {
        Boolean exitoso=false;
        Integer registros=0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        SeccionalPerfil secPerfil = new SeccionalPerfil();
        try {
            registros=(Integer)session.save(perfil);
            secPerfil.setIdPerfil(perfil.getIdPerfil());
            secPerfil.setIdSeccional(idSeccional);
            secPerfil.setIdUsuario(idUsuario);
            session.save(secPerfil);
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
    public List<SeccionalPerfil> obtenerPersonalidades(Integer idSeccional) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<SeccionalPerfil> perfil = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try{
            Query query = session.createQuery("from SeccionalPerfil where idSeccional= :seccional ");
            query.setInteger("seccional", idSeccional);
            perfil = query.list();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session.isOpen()){
                session.close();
            }
           
        }
        return (perfil.isEmpty())? null : perfil;
    }
    public List<Perfil> obtenerPersonalidadesConDetalle(List<SeccionalPerfil> lista) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<Perfil> perfil = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try{
            Integer[] idsPerfiles = convertirIdALista(lista);
            List<Integer> listPerfiles = Arrays.asList(idsPerfiles);
            Query query = session.createQuery("from Perfil where idPerfil in :ids ");
            query.setParameterList("ids", listPerfiles);
            perfil = query.list();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session.isOpen()){
                session.close();
            }
           
        }
        return (perfil.isEmpty())? null : perfil;
    }
    
    private Integer[] convertirIdALista(List<SeccionalPerfil>lista){
        List<Integer>ids= new ArrayList<>();
        for(SeccionalPerfil per:lista){
            ids.add(per.getIdPerfil());
        }
        Integer[] array = new Integer[ids.size()];
        array = ids.toArray(array);
        return array;
    }

    
    
}
