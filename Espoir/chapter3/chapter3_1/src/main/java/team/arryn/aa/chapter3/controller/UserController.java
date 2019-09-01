package team.arryn.aa.chapter3.controller;

import org.springframework.web.bind.annotation.*;
import team.arryn.aa.chapter3.dao.UserDao;
import team.arryn.aa.chapter3.dao.impl.UsrDaoImpl;
import team.arryn.aa.chapter3.model.PO.User;

@RestController
@RequestMapping("user")
public class UserController {

    private UserDao userDao=new UsrDaoImpl();
    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("add")
    public String loginController(User user){
        if ("".equals(user.getName()) || user==null || user.getName()==null){
            return "请输入正确的用户名";
        }else {
            userDao.addUser(user);
            System.out.println(user);
            return "ok";
        }
    }

    /**
     * 根据用户id获取用户
     * @param id
     * @return 用户
     */
    @GetMapping("{id}")
    public String selectUser(@PathVariable("id") int id) {
        User user = userDao.getUserById(id);
        if (user==null){
            return "该用户不存在";
        }else {
           return user+"";
        }
    }

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("all")
    public String selectUsers() {
        return userDao.findAll();
    }

    /**
     * 删除用户
     * @param id
     * @return 成功删除用户的总数量
     */
    @DeleteMapping("{id}")
    public String delUser(@PathVariable("id") int id) {
        User userById = userDao.getUserById(id);
        if (userById==null){
            return "该用户不存在";
        }
        return "已经删除的用户数量"+userDao.removeUser(id);
    }

    /**
     * 修改用户
     * @param user
     * @return 成功修改用户的总数量
     */
    @PutMapping("{id}")
    public String updateUser(@PathVariable("id") int id, User user) {
        if (user==null || "".equals(user.getName())){
            return "请输入正确的用户名";
        }else {
            return "修改成功。已修改用户数量"+userDao.modifyUser(id,user);
        }
    }
}
