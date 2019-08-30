/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.Casilla;
import entidades.SeccionalCasilla;
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
public class CasillaDaoImp implements CasillaDao{

    @Override
    public List<Casilla> obtenerCasillas() {
        //Obtener la conexion a la base datos
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        //------------------------
        //Declaro mi lista del tipo de entidad que necesito
        List<Casilla> casillas=null;
        try{
            //Ejecuto mi query para obtener los resultados.
            casillas = session.createCriteria(Casilla.class).list();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session.isOpen()){
                session.close();
            }
        }
        //REtorna la lista
        return (casillas.isEmpty())?null : casillas;
    }

    @Override
    public List<Casilla> obtenerCasillasPorSeccional(Integer idSeccional) {
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<Casilla> casilla = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try{
            Query query = session.createQuery("from Casilla where idSeccional= :seccional ");
            query.setInteger("seccional", idSeccional);
            casilla = query.list();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session.isOpen()){
                session.close();
            }
           
        }
        return (casilla.isEmpty())? null : casilla;
    }

    @Override
    public Boolean agregarCasilla(Casilla casilla) {
        Boolean exitoso=false;
        Integer registros=0;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        SeccionalCasilla seccCasilla = new SeccionalCasilla();
        try {
            registros=(Integer)session.save(casilla);
            System.out.println("Registros insertados: "+registros);
            seccCasilla.setIdCasilla(casilla.getIdCasilla());
            seccCasilla.setIdSeccional(casilla.getIdSeccional());
            seccCasilla.setIdUsuario(casilla.getIdUsuario());
            session.save(seccCasilla);
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
