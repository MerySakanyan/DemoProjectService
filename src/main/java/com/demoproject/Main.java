package com.demoproject;

import com.demoproject.manager.UserManager;
import com.demoproject.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Main {
    public RestTemplate getRestTemplate() {
    return restTemplate;
}

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static  RestTemplate restTemplate;
    public static void main(String[] args) throws IllegalAccessException {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
     UserManager userManager = (UserManager) context.getBean("userManagerImpl");
        userManager.deleteUser("a@mail.ru");

User user=new User("hj","newpass",5555);


    }
}
