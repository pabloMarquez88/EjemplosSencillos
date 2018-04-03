/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplogabi.dao.impl;

/**
 *
 * @author MAP53733
 */
import com.mycompany.ejemplogabi.dao.PersonaDao;
import com.mycompany.ejemplogabi.modelo.entity.Persona;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Persona save(Persona p) {
//        Session session = this.sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(p);
//		tx.commit();
//		session.close();
        sessionFactory.getCurrentSession().save(p);
        return p;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Persona> list() {
        List<Persona> personList = sessionFactory.getCurrentSession().createQuery("from Persona").list();
        if (personList == null) {
            personList = new ArrayList<>();
        }
        return personList;
    }

    @Override
    public Persona delete(Persona p) {
        this.sessionFactory.getCurrentSession().delete(p);
        p.setId(null);
        return p;
    }

    @Override
    public Persona update(Persona p) {
        this.sessionFactory.getCurrentSession().update(p);
        return p;
    }

}
