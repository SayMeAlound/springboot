package com.springboot.listener;/*

    @author  zjc
    @create 2021-02-03-21:05
     
*/

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloApplicationRunner  implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //可以写一个方法在这里执行
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
//        System.out.println("ApplicationRunner...run....");
    }
}
