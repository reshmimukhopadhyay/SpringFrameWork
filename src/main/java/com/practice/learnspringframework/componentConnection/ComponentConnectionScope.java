package com.practice.learnspringframework.componentConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentConnectionScope {

    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(ComponentConnectionScope.class);
        ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
        System.out.println(componentDao);
    }
}
