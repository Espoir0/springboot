package com.example.demo.dao;

import com.example.demo.model.PO.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    @Insert("insert into user (username,password) values(#{username},#{password})")
    void addUser(User user);

}
