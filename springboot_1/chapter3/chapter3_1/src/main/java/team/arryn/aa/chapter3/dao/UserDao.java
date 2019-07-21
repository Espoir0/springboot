package team.arryn.aa.chapter3.dao;

import team.arryn.aa.chapter3.model.PO.User;

public interface UserDao {
    public abstract void addUser(User user);
    public abstract User getUserById(int id);
    public abstract int removeUser(int id);
    public abstract int  modifyUser(int id,User user);
    public abstract String findAll();
}
