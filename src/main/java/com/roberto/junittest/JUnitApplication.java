package com.roberto.junittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JUnitApplication {
    public static void main(String[] args) {
        SpringApplication.run(JUnitApplication.class, args);
        System.out.println("🚀 API JUnit-Test iniciada com sucesso usando Java 21!");
    }
}
