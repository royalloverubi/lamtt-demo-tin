package com.nhannt.snef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class SnefApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnefApplication.class, args);
    }

}
