package com.practice.learnspringframework.componentConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDao {

    @Autowired
    private JdbcConnectionComponent jdbcConnectionComponent;

    public void setJdbcConnectionComponent(JdbcConnectionComponent jdbcConnectionComponent){
        this.jdbcConnectionComponent=jdbcConnectionComponent;
    }

    public JdbcConnectionComponent getJdbcConnectionComponent(){
        return jdbcConnectionComponent;
    }
}
