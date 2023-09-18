package com.practice.learnspringframework.dependencyLearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.practice.learnspringframework.dependencyLearning")
public class DependencyLauncher {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(DependencyLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }



}
