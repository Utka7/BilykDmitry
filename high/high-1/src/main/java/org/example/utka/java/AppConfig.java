package org.example.utka.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example.utka")
public class AppConfig {
    @Bean
    public JavaBean javaBean() {
        return new JavaBean();
    }
}
