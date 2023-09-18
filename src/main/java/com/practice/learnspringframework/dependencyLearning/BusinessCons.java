package com.practice.learnspringframework.dependencyLearning;

import org.springframework.stereotype.Component;

@Component
public class BusinessCons {

    Dependency1 dependency1;
    Dependency2 dependency2;

    public BusinessCons(Dependency1 dependency1,Dependency2 dependency2){
        super();
        this.dependency1=dependency1;
        this.dependency2=dependency2;
    }

    public String toString(){
        return "Dependency1"+dependency1+"\nDependency2"+dependency2;
    }
}
