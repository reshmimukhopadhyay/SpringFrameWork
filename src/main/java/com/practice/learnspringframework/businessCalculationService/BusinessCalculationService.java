package com.practice.learnspringframework.businessCalculationService;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {


    DataService dataService;

    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService=dataService;
    }
    public int retrieveMaxNumber(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
