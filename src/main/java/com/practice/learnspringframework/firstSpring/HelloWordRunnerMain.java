package com.practice.learnspringframework.firstSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWordRunnerMain {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("personMethodInjection"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person4Parameter"));
        System.out.println(context.getBean(Address.class));
        //System.out.println(context.getBean(Person.class));
       // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
