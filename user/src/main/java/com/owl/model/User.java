package com.owl.model;

import lombok.Data;

/**
 * className User.java
 *
 * @author owl-loong Yuan
 * @version 1.0.0
 * description 用户实体 <br/>
 * createTime 2021-12-06 16:50:00
 */
@Data
public class User {
    private int id;

    private String name;

    private int age;

    private String passwordEncrypt;

    private String address;

    private String telPhone;

    private String qq;

    private String wechat;

    private String email;

    private String sex;

    private String birthday;

    private String account;

}
