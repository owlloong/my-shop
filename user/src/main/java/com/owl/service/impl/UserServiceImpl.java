package com.owl.service.impl;

import com.owl.dao.UserDao;
import com.owl.model.User;
import com.owl.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName UserService.java
 *
 * @author owl-loong Yuan
 * @version 1.0.0 <br/>
 * Description 用户服务接口 <br/>
 * CreateTime 2021-12-06 17:43:00
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUserInfo() {
        return userDao.findUserInfo();
    }

    @Override
    public void insertUserInfo(User user) {
        userDao.insertUserInfo(user);
    }
}
