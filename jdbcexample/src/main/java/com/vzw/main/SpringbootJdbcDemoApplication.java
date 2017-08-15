package com.vzw.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.vzw")
public class SpringbootJdbcDemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootJdbcDemoApplication.class, args);
    }
}