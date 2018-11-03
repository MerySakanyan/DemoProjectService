package com.demoproject.controller;

import com.demoproject.manager.UserManager;
import com.demoproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

//@Controller
public class UserController {
    @Autowired
    private UserManager userManager;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomePage(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public ResponseEntity adduser(@RequestBody User user) {

        if (user != null) {
            try {
                userManager.addUser(user);
                return ResponseEntity.ok("User was added successfully");
            } catch (IllegalAccessException e) {
                return ResponseEntity.ok("Try again, you enter incorrect data");
            }
        } else return ResponseEntity.ok("Something is incorrect");


    }

    @RequestMapping(value = "/deleteuser", method = RequestMethod.POST)
    public ResponseEntity deleteuser(@RequestBody String email) {
        try {

            if (email != null) {

                userManager.deleteUser(email);
                return ResponseEntity.ok("User was deleted successfully");

            } else return ResponseEntity.ok("Something is incorrect");
        } catch (Exception e) {
            return ResponseEntity.ok("Something is incorrect");
        }


    }
}
