package com.alex.starusercontrol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.alex.starusercontrol.mapper")
public class StarUsercontrolApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarUsercontrolApplication.class, args);
    }

}



