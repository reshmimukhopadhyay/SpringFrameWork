package com.practice.learnspringframework.personConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcConnectionScope {

    public static void main(String[] args){

        ApplicationContext applicationContext = SpringApplication.run(JdbcConnectionScope.class);
        PersonDAO personDAO1=applicationContext.getBean(PersonDAO.class);
        System.out.println(personDAO1);
        System.out.println(personDAO1.getJdbcConnection());
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
        System.out.println(personDAO2);
        System.out.println(personDAO2.getJdbcConnection());


    }
}
