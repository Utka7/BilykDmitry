package org.example.utka;

import org.example.utka.annotation.AnnotationBean;
import org.example.utka.java.AppConfig;
import org.example.utka.java.JavaBean;
import org.example.utka.xml.XmlBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        XmlBean xmlBean = context.getBean("xmlBean", XmlBean.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(xmlBean.getName());

        AnnotationBean annotationBean = context.getBean("annotationBean",AnnotationBean.class);
        System.out.println(annotationBean.getName());

        JavaBean javaBean = applicationContext.getBean(JavaBean.class);
        System.out.println(javaBean.getName());

        context.close();
    }
}
