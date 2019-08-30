/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import configuracion.HibernateUtil;
import entidades.TipoUsuario;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author franciscoornelas
 */
public class TipoUsuarioImp implements TipoUsuarioDao{

    @Override
    public List<TipoUsuario> obtenerTipoUsuario() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<TipoUsuario> tipoUsuarios = new ArrayList<>();
        Transaction tx = session.beginTransaction();
        try {
            tipoUsuarios = session.createCriteria(TipoUsuario.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return tipoUsuarios;
    }
    
}
