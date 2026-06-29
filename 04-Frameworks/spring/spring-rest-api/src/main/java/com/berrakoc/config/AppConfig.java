package com.berrakoc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.berrakoc.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){ //createing this cuz we dont have database for now
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Berra","Koc"));
		employeeList.add(new Employee("2","Katre","Ok"));
		employeeList.add(new Employee("3","Ebru","Deniz"));
		employeeList.add(new Employee("4","Emre","Girgin"));
		employeeList.add(new Employee("5","Koray","Ürün"));
		
		return employeeList;
		
	}

}
