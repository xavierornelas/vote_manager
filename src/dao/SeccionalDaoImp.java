/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.Seccional;
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
public class SeccionalDaoImp implements SeccionalDao{

    @Override
    public List<Seccional> obtenerSeccionales() {
        //Obtener la conexion a la base datos
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        //------------------------
        //Declaro mi lista del tipo de entidad que necesito
        List<Seccional> seccional=null;
        try{
            //Ejecuto mi query para obtener los resultados.
            seccional = session.createCriteria(Seccional.class).list();
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
        return (seccional.isEmpty())?null : seccional;
    }

    @Override
    public Boolean agregarSeccional(Seccional seccional) {
        Boolean exitoso=false;
        Integer registros=0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            registros=(Integer)session.save(seccional);
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
    public Seccional obtenerSeccionalPorNombre(String seccional) {
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<Seccional> seccion = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try{
            Query query = session.createQuery("from Seccional where seccional= :seccional ");
            query.setString("seccional", seccional);
            seccion = query.list();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session!=null){
                session.close();
            }
           
        }
        return (seccion.isEmpty())? null : seccion.get(0);
    }

    @Override
    public List<Seccional> obtenerSeccionalesNoRegistrados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
