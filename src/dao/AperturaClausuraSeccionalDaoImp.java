/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.AperturaClausuraSeccional;
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
public class AperturaClausuraSeccionalDaoImp implements AperturaClausuraSeccionalDao{

    @Override
    public Boolean agregarAperturaClausura(AperturaClausuraSeccional aper) {
        Boolean exitoso=false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(aper);
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
    public List<AperturaClausuraSeccional> obtenerRegistrosPorCasilla(Integer idCasilla) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<AperturaClausuraSeccional> resultados = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try{
            Query query = session.createQuery("from AperturaClausuraSeccional where idCasilla= :idCasilla ");
            query.setInteger("idCasilla", idCasilla);
            resultados = query.list();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(session.isOpen()){
                session.close();
            }
           
        }
        return (resultados.isEmpty())? null : resultados;
    }
    
}
