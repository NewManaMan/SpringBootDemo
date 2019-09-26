package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName TestSpringBoot
 * @Description
 * @Author
 * @Date 2019-09-02 16:52
 * @Version V1.0
 **/
@RestController
@SpringBootApplication
public class TestSpringBoot {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world";
    }

    public static void main(String args[]){
        SpringApplication.run(TestSpringBoot.class,args);
    }
}
