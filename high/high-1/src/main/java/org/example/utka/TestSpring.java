package org.example.utka;

import org.example.utka.annotation.AnnotationBean;
import org.example.utka.java.AppConfig;
import org.example.utka.java.JavaBean;
import org.example.utka.xml.XmlBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        var contextXml = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        var xmlBean = contextXml.getBean("xmlBean", XmlBean.class);
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(xmlBean.getName());

        var annotationBean = contextXml.getBean("annotationBean", AnnotationBean.class);
        System.out.println(annotationBean.getName());

        var javaBean = applicationContext.getBean(JavaBean.class);
        System.out.println(javaBean.getName());

        contextXml.close();
    }
}
