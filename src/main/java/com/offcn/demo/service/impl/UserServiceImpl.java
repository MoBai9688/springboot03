package com.offcn.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.demo.dao.UserDao;
import com.offcn.demo.pojo.User;
import com.offcn.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getAll();
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.delete(id);
    }
}
