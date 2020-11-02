package com.genfinfder.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GenFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenFinderApplication.class, args);
    }

}
