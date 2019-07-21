package com.example.demo.service.impl;

import com.example.demo.dao.DatastoresDao;
import com.example.demo.model.PO.Datastores;
import com.example.demo.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

//@Service是标记实现类。@Service把spring容器中的bean进行实例化，等同于new操作
@Service
public class DataServiceImpl implements IDataService {
    @Autowired
    private DatastoresDao data;

    @Override
    public String addUser(Datastores user) {
        Datastores u=data.selectUser(user.getId());
        if(null!=u){
            return "{\"status\":\"exist\"}";
        }else{
            Date d=new Date();
            user.setCreation_time(d);
            data.addUser(user);
            System.out.println("user = ["+user+"]");
            return "{\"status\":\"ok\"}";
        }
    }

    @Override
    public String selectUser(int id) {

        Datastores u = data.selectUser(id);
        if (null == u) {
            return "{\"status\":\"no exist\"}";
        } else {
            return "{\"status\":\"exist\"}";
        }
    }

    @Override
    public String updateUser(Datastores user){
        Datastores u=data.selectUser(user.getId());
        if(null==u){
            return "{\"status\":\"no exist\"}";
        }else{
            data.updateUser(user);
            return "{\"status\":\"ok\"}";
        }
    }

    @Override
    public String delUser(int id){
        Datastores u=data.selectUser(id);
        if(null==u){
            return "{\"status\":\"no exist\"}";
        }else{
            data.deleteUser(id);
            return "{\"status\":\"ok\"}";
        }
    }
}
