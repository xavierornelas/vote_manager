/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.VotoEsperado;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelas
 */
public class VotoEsperadoDaoImp implements VotoEsperadoDao{

    @Override
    public Boolean registrarVotoEsperado(VotoEsperado votoEsperado) {
        Boolean exitoso=false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(votoEsperado);
            System.out.println("Se registró valor con éxito");
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
