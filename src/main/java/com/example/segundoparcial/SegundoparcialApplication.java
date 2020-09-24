package com.example.segundoparcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@CrossOrigin(origins = "*")
@SpringBootApplication
public class SegundoparcialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SegundoparcialApplication.class, args);
    }
}
