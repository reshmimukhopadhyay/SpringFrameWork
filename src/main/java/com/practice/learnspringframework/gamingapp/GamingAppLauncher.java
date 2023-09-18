package com.practice.learnspringframework.gamingapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practice.learnspringframework.gamingapp")
public class GamingAppLauncher {

    /*@Bean
    public GamingAppConsole game(){
        var gameMario = new MarioGame();
        return gameMario;
    }*/

    /*@Bean
    public GamingAppRunner appRunner(GamingAppConsole appConsole){
        var gamingAppRunner = new GamingAppRunner(appConsole);
        return gamingAppRunner;
    }*/

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class);
        context.getBean(GamingAppConsole.class).up();
        context.getBean(GamingAppRunner.class).run();





    }
}
