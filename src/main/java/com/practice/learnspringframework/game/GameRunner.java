package com.practice.learnspringframework.game;

public class GameRunner {

    //MarioGame game;

    GameRunnerConsole gameRunnerConsole;

    /*public GameRunner(MarioGame game){
        this.game=game;
    }*/

    public GameRunner(GameRunnerConsole gameRunnerConsole){
        this.gameRunnerConsole=gameRunnerConsole;
    }

    public void run(){
        System.out.println(gameRunnerConsole);
        gameRunnerConsole.up();
        gameRunnerConsole.down();
        gameRunnerConsole.left();
        gameRunnerConsole.right();
    }

}
