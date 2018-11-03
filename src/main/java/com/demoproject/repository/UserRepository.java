package com.demoproject.repository;


import com.demoproject.model.User;

public interface UserRepository {
    void addUser(User user) throws IllegalAccessException;

    User getByEmail(String email);
   ;
    void deleteUSer(String id);

}
