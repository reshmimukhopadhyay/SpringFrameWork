package com.practice.learnspringframework.lazyIn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FirstSecondLauncher {

    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(FirstSecondLauncher.class);
        context.getBean(Second.class).runThis();
    }
}
