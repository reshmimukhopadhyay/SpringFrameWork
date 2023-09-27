package com.practice.learnspringframework.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SystemClassLauncher {

    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(SystemClassLauncher.class);
        System.out.println(context.getBean(SystemClass1.class));
        System.out.println(context.getBean(SystemClass1.class));
        System.out.println(context.getBean(SystemClass1.class));
        System.out.println(context.getBean(SystemClass1.class));

        System.out.println(context.getBean(SystemClass2.class));
        System.out.println(context.getBean(SystemClass2.class));
        System.out.println(context.getBean(SystemClass2.class));
        System.out.println(context.getBean(SystemClass2.class));
    }
}
