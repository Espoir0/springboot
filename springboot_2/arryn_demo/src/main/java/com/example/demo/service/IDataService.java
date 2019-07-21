package com.example.demo.service;

import com.example.demo.model.PO.Datastores;

public interface IDataService {
    String addUser(Datastores datastores);
    String selectUser(int id);
    String updateUser(Datastores datastores);
    String delUser(int id);
}
