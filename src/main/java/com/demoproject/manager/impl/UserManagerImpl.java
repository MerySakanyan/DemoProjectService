package com.demoproject.manager.impl;

import com.demoproject.manager.UserManager;
import com.demoproject.model.User;
import com.demoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User getByEmail(String email) {
        return userRepository.getByEmail(email);
    }

    @Override
    public void addUser(User user) throws IllegalAccessException {

        userRepository.addUser(user);


    }

    @Override
    public void deleteUser(String email) {
        if (email!=null){
            userRepository.deleteUSer(email);
        }
    }




}
