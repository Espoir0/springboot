package team.arryn.aa.chapter3.service.impl;

import org.springframework.stereotype.Service;
import team.arryn.aa.chapter3.dao.UserDao;
import team.arryn.aa.chapter3.dao.impl.UserDaoImpl;
import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.service.UserService;
import team.arryn.aa.chapter3.util.Result;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao =new UserDaoImpl();

    @Override
    public Result addUser(User user) {
        if (user==null && "".equals(user.getUsername())){
            return new Result("用户名不能为空");
        }else {
            userDao.addUser(user);
            return new Result("ok");
        }
    }

    @Override
    public Result getUserByUsername(int  id) {
        User user = userDao.getUserByUsername(id);
        if (user==null){
            return new Result("userNotExist");
        }else {
            return new Result(user);
        }
    }

    @Override
    public Result updateUser(int id,User user) {
        userDao.modifyUser(id,user);
        System.out.println(id+""+user);

        return new Result("ok");
    }

    @Override
    public Result delUser(int id) {
        userDao.removeUser(id);
        System.out.println(id);
        return new Result("ok");
    }


}
