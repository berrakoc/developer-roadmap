package com.berrakoc.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.berrakoc"}) //it doesn't work if you don't write this
@ComponentScan(basePackages = {"com.berrakoc"}) //restcontroller srvice gibi anatosyonalrın beanlerinin oluşması için tanımladık
@EnableJpaRepositories(basePackages = {"com.berrakoc"} )
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
