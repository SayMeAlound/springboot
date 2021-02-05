package com.springboot.listener;/*

    @author  zjc
    @create 2021-02-03-20:49
     
*/

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("HelloApplicationContextInitializer.......initialize......"+configurableApplicationContext);
    }
}
