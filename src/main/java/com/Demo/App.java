package com.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
    	System.out.println("Application Start-Up");
        SpringApplication.run(App.class, args);
    }

}