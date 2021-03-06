package com.owl.dao;

import com.owl.mapper.UserMapper;
import com.owl.model.User;
import com.owl.vo.UserVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName UserDao.java
 *
 * @author owl-loong Yuan
 * @version 1.0.0 <br/>
 * Description 数据交互API <br/>
 * CreateTime 2021-12-06 17:36:00
 */
@Component
public class UserDao {

    @Resource
    private UserMapper userMapper;

    /**
     * @title findUserInfo <br/>
     * description
     * @author owl-loong Yuan
     * @createTime 2021/12/6 17:39
     * @updateTime 2021/12/6 17:39
     */
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }

    public void insertUserInfo(User user) {
        userMapper.insertUserInfo(user);
    }

    public void updateUserInfo(User user){
        userMapper.updateUserInfo(user);
    }

    public User findUserInfoById(int id){
        return userMapper.findUserInfoById(id);
    }

    public List<User> queryUserByVo(UserVo userVo){
        return userMapper.queryUserByVo(userVo);
    }

    public void deleteUserById(int id){
        userMapper.deleteUserById(id);
    }

}
