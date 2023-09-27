package com.practice.learnspringframework.componentConnection;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnectionComponent {

   public JdbcConnectionComponent(){
       System.out.println("Jdbc Connection");
   }
}
