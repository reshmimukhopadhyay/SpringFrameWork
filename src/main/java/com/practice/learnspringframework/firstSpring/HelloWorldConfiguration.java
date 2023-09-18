package com.practice.learnspringframework.firstSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name,int age,Address address){};

record Address(String firstLine, int zip){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ravi";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Pompi",12,new Address("123 Dekar Lane",711102));
    }

    @Bean
    public Person personMethodInjection(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameter(String name,int age, @Qualifier("addressQualifier")Address address){
        return new Person(name,age,address);
    }

    @Bean
    public Person person4Parameter(String name,int age, Address address){
        return new Person(name,age,address);
    }
    @Bean(name="address2")
    @Primary
    public Address address(){
        return new Address("124 Raja lane", 711102);
    }

    @Bean(name="address3")
    @Qualifier("addressQualifier")
    public Address address3(){
        return new Address("124 Sarat lane", 711102);
    }
}
