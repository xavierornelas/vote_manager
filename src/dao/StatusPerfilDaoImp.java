/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.Seccional;
import entidades.StatusPerfil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelas
 */
public class StatusPerfilDaoImp implements StatusPerfilDao{

    @Override
    public List<StatusPerfil> obtenerStatusPerfil() {
         //Obtener la conexion a la base datos
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        //------------------------
        //Declaro mi lista del tipo de entidad que necesito
        List<StatusPerfil> statusPerfil=null;
        try{
            //Ejecuto mi query para obtener los resultados.
            statusPerfil = session.createCriteria(StatusPerfil.class).list();
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
        return (statusPerfil.isEmpty())?null : statusPerfil;
    }
    
}
