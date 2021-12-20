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

    private String password;
}
