package com.Practice.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
        
		//update port
		SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "9080"));
        app.run(args);
        //he
	}

}
