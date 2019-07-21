package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class LoginController {
    @Autowired
    private UserDao userDao;

    @PostMapping("/register")
    public String loginVefify(User user){
        User u=userDao.getUserByUserName(user.getUsername());
        if(null!=u){
            return "{\"status\":\"exist\"}";
        }else if (user.getUsername().length()>10){
            return "{\"status\":\"theNameIsTooLong\"}";

        }else{
            userDao.addUser(user);
            System.out.println("user=["+user+"]");
            log(user.getUsername(),"注册");
            return "{\"status\":\"ok\"}";
        }
    }

    @PostMapping("/login")
    public String login(User user){
        User u=userDao.getUserByUserName(user.getUsername());
        if(null==u){
            return "{\"status\":\"null\"}";
        }else{
            String password=user.getPassword();
            if (password.equals(u.getPassword())){
                log(user.getUsername(),"登录");    //记录log
                return "{\"status\":\"ok\"}";
            }
            return "{\"status\":\"fail\"}";
        }


    }

    @DeleteMapping("/del")
    public String deleteUser(String username){
        User user=userDao.getUserByUserName(username);
        if(null==user){
            return "{\"status\":\"no exist\"}";
        }else{
            userDao.deleteUser(username);
            log(username,"注销");

            return "{\"status\":\"ok\"}";
        }
    }

    @PostMapping("/update")
    public String updateUser(User user){
        User u=userDao.getUserByUserName(user.getUsername());
        if(null==u){
            return "{\"status\":\"no exist\"}";
        }else if (user.getUsername().length()>10){
            return "{\"status\":\"theNameIsTooLong\"}";
        }else {
            userDao.updateUser(user);
            System.out.println("user=["+user+"]");
            log(user.getUsername(),"修改密码");
            return "{\"status\":\"ok\"}";
        }
    }

    @GetMapping("/sel")
    public String selectUser(String username){
        User u=userDao.getUserByUserName(username);
        if(null==u){
            return "{\"status\":\"null\"}";
        }else{
            log(username,"查询");

            return "{\"status\":\"exist\"}";
        }
    }

    /**
     *  记录用户的日志
     * @param name   用户名
     * @param action 用户行为
     */
    public static void log(String name,String action){
        String time=new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date());  //获取用户登录时间

        String message="用户"+name+"在"+time+action;        //日志信息
        try(
                BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt",true));) {

            bw.write(message);
            bw.newLine();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
