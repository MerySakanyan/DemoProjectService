package com.demoproject.manager;


import com.demoproject.model.User;

public interface UserManager {

   User getByEmail(String email);
   void addUser(User user) throws IllegalAccessException;
   void deleteUser(String id);
}
