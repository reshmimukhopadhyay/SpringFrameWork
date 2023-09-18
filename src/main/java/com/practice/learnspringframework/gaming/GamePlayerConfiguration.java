package com.practice.learnspringframework.gaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamePlayerConfiguration {

    @Bean
    public GamePlayerConsole gamePlayerConsole(){
        var game = new PokerGame();
        return game;
    }

    @Bean
    public GamePlayerRunner gamePlayerRunner(GamePlayerConsole gamePlayerConsole){
        var gamePlayerRunner = new GamePlayerRunner(gamePlayerConsole);
        return gamePlayerRunner;
    }
}
