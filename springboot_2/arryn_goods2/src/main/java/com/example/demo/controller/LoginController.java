package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.MagicCube;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private IGoodsService goodsservice;
    @Autowired
    private UserDao userDao;

    @PostMapping("/register")
    public String loginVefify(MagicCube mc) {
        String str=goodsservice.addGoods(mc);
        return str;
    }

    @DeleteMapping("/dell")
    public String deleteUser(String magicCubeName) {
        String str=goodsservice.delUser(magicCubeName);
        return str;
    }

    @PostMapping("/update")
    public String updateUser(MagicCube mc) {
        String str=goodsservice.updateUser(mc);
        return str;
    }

    @GetMapping("/sel")
    public String selectUser(String magicCubeName) {
        String str=goodsservice.selectUser(magicCubeName);
        return str;
    }





}
