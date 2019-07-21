package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login")
    public String login(String username,String password){
        System.out.println("username = [" + username + "], password = [" + password + "]");
        if(username.equals("小明")) {

            return "{\"status\":\"ok\"}";
        }else{

            return "{\"status\":\"fail\"}";
        }
    }

}
