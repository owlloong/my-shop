package com.owl.service;

import com.owl.model.User;
import com.owl.vo.UserVo;

import java.util.List;

/**
 * ClassName IUserService.java
 *
 * @author owl-loong Yuan
 * @version 1.0.0 <br/>
 * Description 用户服务接口API <br/>
 * CreateTime 2021-12-06 17:43:00
 */
public interface IUserService {

     User findUserInfo();

     void insertUserInfo(User user);

     void updateUserInfo(User user);

     User findUserById(int id);

     List<User> queryUserByVo(UserVo userVo);

     void deleteUserById(int id);
}
