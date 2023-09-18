package com.practice.learnspringframework.gamingapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements GamingAppConsole {
    public void up(){
        System.out.println("UP-M");
    }

    public void down(){
        System.out.println("DOWN-M");
    }

    public void left(){
        System.out.println("LEFT-M");
    }

    public void right(){
        System.out.println("RIGHT-M");
    }
}
