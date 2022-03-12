package com.bj.boot05web01.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/111.jpg")
    public String hello(){
        System.out.println(666);
        System.out.println(777);
        System.out.println(888);
        System.out.println("master test");
        return "aaa";
    }
}
