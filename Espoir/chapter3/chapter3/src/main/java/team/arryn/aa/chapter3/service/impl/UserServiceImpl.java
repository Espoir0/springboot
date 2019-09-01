package team.arryn.aa.chapter3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.arryn.aa.chapter3.PO.User;
import team.arryn.aa.chapter3.dao.UserDao;

import team.arryn.aa.chapter3.service.UserService;
import team.arryn.aa.chapter3.util.Result;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public Result addUser(User user) {
        Result result = new Result();
        if (user==null && "".equals(user.getName())){
            result.setStatus(200);
            result.setData("用户名为空");
        }else {
            userDao.save(user);
            result.setStatus(200);
            result.setData("ok");
        }
        return result;
    }

    @Override
    public Result getUserById(Long id) {
        Result result = new Result();
        User user = userDao.findOne(id);
        if (user==null){
            result.setStatus(200);
            result.setData("用户不存在");
        }else {
            result.setStatus(200);
            result.setData(user);
        }
        return result;
    }

    @Override
    public Result delUser(Long id) {
        userDao.delete(id);
        return new Result("ok");
    }

    @Override
    public Result updateUser(User user) {
        userDao.save(user);
        return new Result("ok");
    }
}
