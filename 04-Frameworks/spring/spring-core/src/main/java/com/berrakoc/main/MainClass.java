package com.berrakoc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.berrakoc.config.AppConfig;
import com.berrakoc.model.User;
import com.berrakoc.services.LoginService;
import com.berrakoc.services.UserService; 

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        
        for (User user : userService.getUserList()) {
			System.out.println(user);
		}
        
        LoginService loginService = new LoginService();
        loginService.login();
    }
}
