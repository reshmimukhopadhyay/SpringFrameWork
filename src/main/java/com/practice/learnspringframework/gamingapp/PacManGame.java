package com.practice.learnspringframework.gamingapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingAppConsole {

    public void up(){
        System.out.println("UP-P");
    }

    public void down(){
        System.out.println("DOWN-P");
    }

    public void left(){
        System.out.println("LEFT-P");
    }

    public void right(){
        System.out.println("RIGHT-P");
    }
}
