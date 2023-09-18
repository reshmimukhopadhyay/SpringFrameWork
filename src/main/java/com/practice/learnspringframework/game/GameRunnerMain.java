package com.practice.learnspringframework.game;

public class GameRunnerMain {

    public static void main (String[] args){
        //MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();
        PacManGame game = new PacManGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
