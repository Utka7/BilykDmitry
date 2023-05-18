package com.example.utka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application-context.xml");
        MyConfig myConfig = context.getBean(MyConfig.class);

        System.out.println("Name " + myConfig.getName());
        System.out.println("Value " + myConfig.getValue());
    }
}
