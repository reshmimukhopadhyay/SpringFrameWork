package com.practice.learnspringframework.dependencyLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessWithSetter {


    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1){
        this.dependency1=dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2){
        this.dependency2=dependency2;
    }

    public String toString(){
        return "Dependency1"+dependency1+"\nDependency2"+dependency2;
    }




}
