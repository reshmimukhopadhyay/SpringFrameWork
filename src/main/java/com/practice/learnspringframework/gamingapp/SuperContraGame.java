package com.practice.learnspringframework.gamingapp;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingAppConsole {

    public void up(){
        System.out.println("UP-S");
    }

    public void down(){
        System.out.println("DOWN-S");
    }

    public void left(){
        System.out.println("LEFT-S");
    }

    public void right(){
        System.out.println("RIGHT-S");
    }
}
