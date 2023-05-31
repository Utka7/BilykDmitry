package com.example.utka;

import com.example.utka.annotation.AnnotationBean;
import com.example.utka.java.AppConfig;
import com.example.utka.java.JavaBean;
import com.example.utka.xml.XmlBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        var Xmlcontext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        var xmlBean = Xmlcontext.getBean("xmlBean", XmlBean.class);
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(xmlBean.getName());

        var annotationBean = Xmlcontext.getBean("annotationBean", AnnotationBean.class);
        System.out.println(annotationBean.getName());

        var javaBean = applicationContext.getBean(JavaBean.class);
        System.out.println(javaBean.getName());

        Xmlcontext.close();
        applicationContext.close();
    }
}
