/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.VotoAproximado;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelas
 */
public class VotoAproximadoDaoImp implements VotoAproximadoDao{

    @Override
    public Boolean agregarVotoAproximado(VotoAproximado votoAproximado) {
        Boolean exitoso=false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(votoAproximado);
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
