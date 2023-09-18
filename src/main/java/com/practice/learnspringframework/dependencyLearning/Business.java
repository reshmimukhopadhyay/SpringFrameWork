package com.practice.learnspringframework.dependencyLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Business {

    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    public String toString(){
        return "Dependency1"+dependency1+"\nDependency2"+dependency2;
    }




}
