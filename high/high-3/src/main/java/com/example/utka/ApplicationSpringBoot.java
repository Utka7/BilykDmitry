package com.example.utka;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableConfigurationProperties(MyConfigSpringBoot.class)
public class ApplicationSpringBoot {
    @Autowired
    MyConfigSpringBoot myConfigSpringBoot;

    @Value("${myapp.message}")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }

    @PostConstruct
    public void init(){
        System.out.println(myConfigSpringBoot.getName());
        System.out.println(myConfigSpringBoot.getValue());
        System.out.println(message);
    }

}
