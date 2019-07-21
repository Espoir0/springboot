package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController的意思就是controller里面的方法都以json格式输出
public class HelloController {
    @RequestMapping("/hello")  //在默认端口下添加路由
    String hello(){
        return "hello spring boot";  //访问显示的内容
    }
}
