package org.example.utka.annotation;

import org.springframework.stereotype.Component;

@Component("annotationBean")
public class AnnotationBean {
    private String name;

    public AnnotationBean() {
        this.name = "AnnotationBean";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
