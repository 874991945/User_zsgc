package com.czj.service;

import com.czj.dao.UserDao;
import com.czj.entity.User;

import java.util.List;

public class UserService {

    private UserDao userDao=new UserDao();

    //查询
    public List<User> list() {
        return userDao.list();
    }

    //添加
    public void addUser(User user){
        user.setId(null);
        user.setDept_id(null);
        userDao.addUser(user);
    }

    //数据回显
    public User getUserById(Integer id){
        return userDao.getUserById(id);
    }

    //修改数据
    public void updateUser(User user){
        userDao.updateUser(user);
    }

    //删除数据
    public void deleteById(Integer id){
        userDao.deleteById(id);
    }


}
