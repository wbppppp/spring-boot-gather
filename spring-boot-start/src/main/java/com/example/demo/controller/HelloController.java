package com.example.demo.controller;

import com.example.demo.pojo.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }

    @RequestMapping("/demo")
    public Demo getDemo(){
        Demo demo = new Demo("张三",12);
        return demo;
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2";
    }

}
