package com.practice.learnspringframework.xmlBasedConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlJdbcConnectionRunner {

    private static Logger LOGGER = LoggerFactory.getLogger(XmlJdbcConnectionRunner.class);
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        XmlJdbcConnectionDAo xmlJdbcConnectionDAo = context.getBean(XmlJdbcConnectionDAo.class);
        System.out.println(xmlJdbcConnectionDAo);
        System.out.println(xmlJdbcConnectionDAo.getXmlJdbcConnection());
        LOGGER.info("Bean loaded : ",(Object) context.getBeanDefinitionNames());
    }
}
