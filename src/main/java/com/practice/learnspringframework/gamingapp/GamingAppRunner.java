package com.practice.learnspringframework.gamingapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GamingAppRunner {

    GamingAppConsole gamingAppConsole;

    public GamingAppRunner(@Qualifier("MarioGameQualifier") GamingAppConsole gamingAppConsole){
        this.gamingAppConsole=gamingAppConsole;
    }

    public void run(){
        System.out.println(gamingAppConsole);
        gamingAppConsole.up();
        gamingAppConsole.down();
        gamingAppConsole.left();
        gamingAppConsole.right();
    }
}
