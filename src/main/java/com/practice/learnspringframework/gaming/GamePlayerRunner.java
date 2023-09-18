package com.practice.learnspringframework.gaming;

public class GamePlayerRunner {

    GamePlayerConsole gamePlayerConsole;

    public GamePlayerRunner(GamePlayerConsole gamePlayerConsole){
        this.gamePlayerConsole=gamePlayerConsole;
    }
    public void run(){
        System.out.println(gamePlayerConsole);
        gamePlayerConsole.up();
        gamePlayerConsole.down();
        gamePlayerConsole.left();
        gamePlayerConsole.right();
    }
}
