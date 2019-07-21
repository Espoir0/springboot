package team.arryn.aa.chapter3.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import team.arryn.aa.chapter3.dao.UserDao;
import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.util.JDBCUtils;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSourse());

    @Override
    public void addUser(User user) {
        String sql="insert into user (username,password) values(?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword());
    }

    @Override
    public User getUserByUsername(int id) {
        String sql="select * from user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
        return user;
    }


    @Override
    public void removeUser( int id) {
        String sql="delete from user where id=?";
        jdbcTemplate.update(sql,id);
    }


    @Override
    public void modifyUser(int id,User user) {
        String sql="update user set username=?,password=? where id=?";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),id);
    }
}

