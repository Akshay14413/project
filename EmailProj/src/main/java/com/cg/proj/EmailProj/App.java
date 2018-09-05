package com.cg.proj.EmailProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan("com.cg.proj.Emailproj.bean")
@ComponentScan("com.cg.proj.EmailProj")
@EnableJpaRepositories("com.cg.proj.EmailProj")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
