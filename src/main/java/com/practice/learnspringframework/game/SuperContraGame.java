package com.practice.learnspringframework.game;

import com.practice.learnspringframework.game.GameRunnerConsole;

public class SuperContraGame implements GameRunnerConsole {

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
