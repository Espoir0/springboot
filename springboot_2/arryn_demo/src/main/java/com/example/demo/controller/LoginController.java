package com.example.demo.controller;

import com.example.demo.model.PO.Datastores;
import com.example.demo.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private IDataService userService;

    @PostMapping("/datastores")
    public String loginVerify(Datastores data){
        return userService.addUser(data);
    }

    @GetMapping("/datastores/{id}")
    public String selectData(@PathVariable("id") int id){
        return userService.selectUser(id);
    }

    @PostMapping("/update")
    public String updateData(Datastores data){
        return userService.updateUser(data);
    }

    @DeleteMapping("/del/datastore/{id}")
    public String delData(@PathVariable("id") int id){
        return userService.delUser(id);
    }
}
