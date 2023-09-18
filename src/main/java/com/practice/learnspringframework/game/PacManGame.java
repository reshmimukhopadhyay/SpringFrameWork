package com.practice.learnspringframework.game;

import com.practice.learnspringframework.game.GameRunnerConsole;

public class PacManGame implements GameRunnerConsole {

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
