package com.owl.controller;

import com.owl.model.User;
import com.owl.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * ClassName UserController.java
 *
 * @author owl-loong Yuan
 * @version 1.0.0 <br/>
 * Description 用户控制器 <br/>
 * CreateTime 2021-12-06 17:46:00
 */
@Controller
public class UserController {

    @Resource
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/findUserInfo")
    public User findUserInfo(){
        User user = userService.findUserInfo();
        if (user!= null){
            System.out.println("user.getName():"+user.getName());
        }
        return user;
    }

}
