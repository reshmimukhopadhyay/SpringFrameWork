package com.practice.learnspringframework.personConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnection;


    public void setJdbcConnection(JdbcConnection jdbcConnection){
        this.jdbcConnection=jdbcConnection;
    }

    public JdbcConnection getJdbcConnection(){
        return jdbcConnection;
    }
}
