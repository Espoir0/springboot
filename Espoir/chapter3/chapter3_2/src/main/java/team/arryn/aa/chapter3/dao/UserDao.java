package team.arryn.aa.chapter3.dao;

import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.util.Result;

public interface UserDao {
    void addUser(User user);
    User getUserByUsername(int id);
    void removeUser(int id);
    void modifyUser(int id,User user);
}
