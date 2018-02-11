package com.llh.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by llh on 2018-02-11
 * 项目入口。配置包根路径
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.llh")
public class Entry {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Entry.class,args);
    }
}
