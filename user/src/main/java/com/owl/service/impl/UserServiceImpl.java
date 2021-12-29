package com.owl.service.impl;

import com.owl.dao.UserDao;
import com.owl.model.User;
import com.owl.service.IUserService;
import com.owl.vo.UserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public void updateUserInfo(User user) {
        userDao.updateUserInfo(user);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserInfoById(id);
    }

    @Override
    public List<User> queryUserByVo(UserVo userVo) {
        return userDao.queryUserByVo(userVo);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }
}
