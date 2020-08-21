package com.haitong;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2020/4/19.
 */
@SpringBootApplication
@MapperScan("com.haitong.rector.mapper")
public class OASpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(OASpringBoot.class,args);
    }
}
