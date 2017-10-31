package com.smael.SpringMySQLJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories( basePackages = "com.smael.SpringMySQLJPA.Repository")
@SpringBootApplication
public class SpringMySqljpaApplication {

	public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "true");
	    SpringApplication.run(SpringMySqljpaApplication.class, args);
	}
}
