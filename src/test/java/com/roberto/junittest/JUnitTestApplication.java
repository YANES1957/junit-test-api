package com.roberto.junittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JUnitTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(JUnitTestApplication.class, args);
        System.out.println("🚀 API JUnit-Test iniciada com sucesso usando Java 21!");
    }
}
