package com.zhouzy.tally;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zhouzy.tally.controller")
@ComponentScan("com.zhouzy.tally.entity")
@ComponentScan("com.zhouzy.tally.repository")
public class TallyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TallyApplication.class, args);
    }

}
