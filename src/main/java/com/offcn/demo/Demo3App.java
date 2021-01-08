package com.offcn.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@EnableDubbo
@MapperScan("com.offcn.demo.dao")
@SpringBootApplication
public class Demo3App {
    public static void main(String[] args) {
        SpringApplication.run(Demo3App.class,args);
    }
}