package com.arikanogluulku.thirdhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ThirdhomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdhomeworkApplication.class, args);
    }

}
