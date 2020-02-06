package com.example.collegemangement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@EnableMongoRepositories(basePackages = { "com.example.*" })
@ComponentScan(basePackages = { "com.example.*" })
//@ComponentScan(basePackageClasses = com.example.collegemangement.controller.InstituteController.class )

public class CollegemangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegemangementApplication.class, args);
	}

}
