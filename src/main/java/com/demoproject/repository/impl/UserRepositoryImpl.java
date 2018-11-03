package com.demoproject.repository.impl;


import com.demoproject.model.User;
import com.demoproject.repository.UserRepository;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private SessionFactory sessionFactory;


    @Transactional
    @Override
    public void addUser(User user) throws IllegalAccessException {
        sessionFactory.getCurrentSession().save(user);
    }


    @Transactional
    @Override
    public User getByEmail(String email) {
        Query query = sessionFactory.getCurrentSession().createNativeQuery("Select * From `user` where email = :email").addEntity(User.class);
        query.setParameter("email", email);
        return (User) query.uniqueResult();
    }


    @Override
    @Transactional
    public void deleteUSer(String email) {
       User user=getByEmail(email);
        sessionFactory.getCurrentSession().delete(user);
    }


}
