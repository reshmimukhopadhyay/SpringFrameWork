package com.practice.learnspringframework.searchAlgo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    //private BinarySearchLauncher binarySearchLauncher;
    @Qualifier("bubble")
    private BinarySearchLauncher binarySearchLauncher;

    public int binarySearch(int[] numbers){
        int[] search = binarySearchLauncher.sortAlgo(numbers);
        System.out.println(binarySearchLauncher);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("Post Construct");
    }
}
