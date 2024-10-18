package org.mycola.hebrewcards.service;

import jakarta.persistence.EntityManagerFactory;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HyberFactory {

    private final SessionFactory sessionFactory;

    @Autowired
    public HyberFactory(EntityManagerFactory entityManagerFactory) {
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }

    @Transactional
    public void doSomething() {
        Session session = sessionFactory.getCurrentSession();
        // работа с сессией...
    }


    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
