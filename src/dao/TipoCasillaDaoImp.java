/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.Seccional;
import entidades.TipoCasilla;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelas
 */
public class TipoCasillaDaoImp implements TipoCasillaDao{

    @Override
    public List<TipoCasilla> obtenerTipoCasilla() {
        //Obtener la conexion a la base datos
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        //------------------------
        //Declaro mi lista del tipo de entidad que necesito
        List<TipoCasilla> casilla=null;
        try{
            //Ejecuto mi query para obtener los resultados.
            casilla = session.createCriteria(TipoCasilla.class).list();
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
        return (casilla.isEmpty())?null : casilla;
    }
    
}
