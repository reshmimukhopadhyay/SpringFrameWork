package com.practice.learnspringframework.gamingapp;

import org.springframework.stereotype.Component;

@Component
public interface GamingAppConsole {

    public void up();
    public void down();
    public void left();
    public void right();
}
