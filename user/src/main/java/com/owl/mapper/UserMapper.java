package com.owl.mapper;

import com.owl.model.User;
import com.owl.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * className UserMapper.java
 *
 * @author owl-loong Yuan
 * @version 1.0.0
 * description 数据交互接口 <br/>
 * createTime 2021-12-06 16:49:00
 */
public interface UserMapper {
    User findUserInfo();

    void insertUserInfo(User user);

    void updateUserInfo(User user);

    User findUserInfoById(int userId);

    List<User> queryUserByVo(UserVo userVo);

    void deleteUserById(int id);
}
