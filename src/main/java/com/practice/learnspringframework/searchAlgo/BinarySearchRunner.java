package com.practice.learnspringframework.searchAlgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BinarySearchRunner {

    public static void main(String[] args){

        var context = SpringApplication.run(BinarySearchRunner.class,args);
        BinarySearch search = context.getBean(BinarySearch.class);
        System.out.println(search.binarySearch(new int[]{1,2,3,4,5}));

    }
}
