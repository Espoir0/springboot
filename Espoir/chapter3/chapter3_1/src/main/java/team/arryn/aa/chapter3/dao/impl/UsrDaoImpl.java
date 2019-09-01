package team.arryn.aa.chapter3.dao.impl;

import org.springframework.web.bind.annotation.*;
import team.arryn.aa.chapter3.dao.UserDao;
import team.arryn.aa.chapter3.model.PO.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsrDaoImpl implements UserDao {
    static private Map<Integer,User> userMap=new HashMap<>();
    private int id;

    /**
     * 添加用户
     * @param user
     */
    @Override
    public void addUser(User user) {
        id++;
        user.setId(id);
        userMap.put(id,user);
    }

    /**
     * 根据用户id获取用户
     * @param id
     * @return 用户
     */
    @Override
    public User getUserById(int id) {
        return userMap.get(id);
    }

    /**
     * 删除用户
     * @param id
     * @return 成功删除用户的总数量
     */
    @Override
    public int removeUser( int id) {
        int successRemoveNum=0;
        userMap.remove(id);
        return ++successRemoveNum;
    }

    /**
     * 修改用户
     * @param user
     * @return 成功修改用户的总数量
     */
    @Override
    public int modifyUser(int id,User user) {
        int secModifyNum=0;
        userMap.replace(user.getId(),user);
        return ++secModifyNum;
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public String findAll() {
        Set<Map.Entry<Integer, User>> users = userMap.entrySet();
        Iterator<Map.Entry<Integer, User>> iter = users.iterator();
        String result="";
        while (iter.hasNext()){
            result += "\n"+ iter.next().getValue();
        }
        return result;
    }

}

