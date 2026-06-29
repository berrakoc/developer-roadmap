package com.berrakoc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.berrakoc.model.User;
import com.berrakoc.services.UserService;

@Configuration
public class AppConfig {
	
	@Bean
	public UserService userService() { //instead of void i've written the the return type i want
		UserService userService = new UserService();

		List<User> userList = new ArrayList<>();
		userList.add(new User("Berra")); 
		userList.add(new User("Ebru"));
		
		userService.setUserList(userList);
		
		return userService;

	}

}
