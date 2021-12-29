package com.owl.controller;

import com.owl.model.User;
import com.owl.service.IUserService;
import com.owl.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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

    /**
     * @title findUserInfo
     * @description 查询用户信息
     * @author owl-loong Yuan
     * @updateTime 2021/12/29 14:23
     */
    @ResponseBody
    @RequestMapping("/findUserInfo")
    public User findUserInfo() {
        User user = userService.findUserInfo();
        if (user != null) {
            System.out.println("user.getName():" + user.getName());
        }
        return user;
    }

    @RequestMapping(value = "/toUserRegister", method = RequestMethod.GET)
    public String userRegister() {
        return "user_register";
    }


    @ResponseBody
    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    public String insertUserInfo(User user) {
        System.out.println(user);
        userService.insertUserInfo(user);
        return "success";
    }

    @RequestMapping(value = "/toUserUpdate", method = RequestMethod.GET)
    public String userUpdate(int id, Model model) {
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "user_update";
    }

    @ResponseBody
    @RequestMapping(value = "/userUpdate", method = RequestMethod.POST)
    public String ModifyUserInfo(User user) {
        userService.updateUserInfo(user);
        return "success";
    }

    @RequestMapping(value = "/toUserView", method = RequestMethod.GET)
    public String userView(int id, Model model) {
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "user_view";
    }

    @RequestMapping(value = "/toUserList",method = RequestMethod.GET)
    public String toUserList(Model model){
        UserVo userVo = new UserVo();
        List<User> users = userService.queryUserByVo(userVo);
        model.addAttribute("users",users);
        return "user_list";
    }

    @ResponseBody
    @RequestMapping(value = "/delUserById",method = RequestMethod.GET)
    public String delUserById(int id){
        userService.deleteUserById(id);
        return "success";
    }

}
