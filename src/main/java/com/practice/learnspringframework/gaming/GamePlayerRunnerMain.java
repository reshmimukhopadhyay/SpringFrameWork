package com.practice.learnspringframework.gaming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamePlayerRunnerMain {

    public static void main (String[] args){
        var context = new AnnotationConfigApplicationContext(GamePlayerConfiguration.class);

        context.getBean(GamePlayerConsole.class).up();
        context.getBean(GamePlayerRunner.class).run();
    }

}
