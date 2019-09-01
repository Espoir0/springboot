package team.arryn.aa.chapter3.service;


import team.arryn.aa.chapter3.PO.User;
import team.arryn.aa.chapter3.util.Result;

public interface UserService {
    Result addUser(User user);
    Result getUserById(Long id);
    Result updateUser(User user);
    Result delUser(Long id);
}
