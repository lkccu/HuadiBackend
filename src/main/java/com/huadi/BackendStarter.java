package com.huadi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
@Slf4j
@SpringBootApplication()
public class BackendStarter {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BackendStarter.class, args);
        // 2.查看容器里的组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);//test

        }
}

