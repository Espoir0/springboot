package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.MagicCube;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private UserDao userDao;

    @Override
    public String addGoods(MagicCube mc) {
        MagicCube m = userDao.getUserByMagicCubeName(mc.getMagicCubeName());
        if (null != m) {
            return "{\"status\":\"exist\"}";

        } else {
            Date d = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String date = df.format(d);
            mc.setCreateTime(date);
            mc.setUpdateTime(date);
            mc.setDeleteFlag(0);

            //String encryptPrice = MD5Util.computeMD5(mc.getPrice());
            //mc.setPrice(encryptPrice);

            userDao.addMagicCube(mc);
            System.out.println("user=[" + mc + "]");
            return "{\"status\":\"ok\"}";
        }
    }

    @Override
    public String delUser(String magicCubeName){
        MagicCube mc = userDao.getUserByMagicCubeName(magicCubeName);
        if (null == mc) {
            return "{\"status\":\"no exist\"}";

        } else {
            userDao.delMagicCube(magicCubeName);
            return "{\"status\":\"ok\"}";
        }
    }
    @Override
    public String updateUser(MagicCube mc){
        MagicCube m = userDao.getUserByMagicCubeName(mc.getMagicCubeName());
        if (null == m) {
            return "{\"status\":\"no exist\"}";

        } else {
            userDao.updateMagicCube(mc);
            System.out.println("user=[" + mc + "]");
            return "{\"status\":\"ok\"}";
        }
    }

    @Override
    public String selectUser(String magicCubeName){
        if (magicCubeName == null) {
            return "{\"status\":\"null\"}";
        } else {
            MagicCube mc = userDao.getUserByMagicCubeName(magicCubeName);
            System.out.println("user=[" + mc + "]");
            if(null==mc){
                return "{\"status\":\"null\"}";
            }else{
                return "{\"status\":\"exist\"}";
            }
        }
    }

}

