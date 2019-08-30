/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.Casilla;
import entidades.TipoHorarioSeccional;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelasmartinez
 */
public class TipoHorarioSeccionalDaoImp implements TipoHorarioSeccionalDao{

    @Override
    public List<TipoHorarioSeccional> obtenerTipoHorario() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        //------------------------
        //Declaro mi lista del tipo de entidad que necesito
        List<TipoHorarioSeccional> tipoHorario=null;
        try{
            //Ejecuto mi query para obtener los resultados.
            tipoHorario = session.createCriteria(Casilla.class).list();
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
        return (tipoHorario.isEmpty())?null : tipoHorario;
    }

    @Override
    public TipoHorarioSeccional obtenerTipoHorario(Integer idTipoHorario) {
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<TipoHorarioSeccional> horario = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try{
            Query query = session.createQuery("from TipoHorarioSeccional where idTipoHorarioSeccional= :idTipoHorarioSeccional ");
            query.setInteger("idTipoHorarioSeccional", idTipoHorario);
            horario = query.list();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session.isOpen()){
                session.close();
            }
           
        }
        return (horario.isEmpty())? null : horario.get(0);
    }
    
}
