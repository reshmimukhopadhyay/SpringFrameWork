package com.practice.learnspringframework.lazyIn;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Second {

    First first;

    public Second(First first){

        System.out.println("Launch");
        this.first=first;
    }

    public void runThis(){
        System.out.println("Print this");
    }
}
