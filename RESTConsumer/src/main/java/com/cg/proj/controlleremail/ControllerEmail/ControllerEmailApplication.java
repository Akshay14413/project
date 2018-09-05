package com.cg.proj.controlleremail.ControllerEmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.proj.controlleremail.controller")
public class ControllerEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerEmailApplication.class, args);
	}
}
