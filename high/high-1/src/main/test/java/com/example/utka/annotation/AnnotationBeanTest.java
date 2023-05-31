package com.example.utka.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = AnnotationBean.class)
class AnnotationBeanTest {

    @Autowired
    private AnnotationBean annotationBean;

    @Test
    public void AnnotationBean_ClassExists_ExpectedResult(){
        assertNotNull(annotationBean);
        assertEquals("AnnotationBean", annotationBean.getName());
    }

}