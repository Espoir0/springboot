package com.example.demo.service;

import com.example.demo.model.PO.MagicCube;

public interface IGoodsService {
    String addGoods(MagicCube mc);
    String delUser(String MagicCubeName);
    String updateUser(MagicCube mc);
    String selectUser(String MagicCubeName);



}
