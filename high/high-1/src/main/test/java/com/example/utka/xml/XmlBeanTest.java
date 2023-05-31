package com.example.utka.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig
@ContextConfiguration("classpath:applicationContext.xml")
class XmlBeanTest {

    @Autowired
    private XmlBean xmlBean;

    @Test
    public void testXmlBean_ClassExists_ExpectedResult() {
        assertNotNull(xmlBean);
        assertEquals("XmlBean", xmlBean.getName());
    }

}