package com.example.utka.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(classes = AppConfig.class)
class JavaBeanTest {

    @Autowired
    private JavaBean javaBean;

    @Test
    public void JavaBean_ClassExists_ExpectedResult(){
        assertNotNull(javaBean);
        assertEquals("JavaBean", javaBean.getName());
    }
}