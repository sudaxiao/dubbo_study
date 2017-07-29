package com.dfire.entity;

import lombok.Data;

/**
 * Created by ch on 2017/7/12.
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String flowerName;
    private String phone;
    private String email;
    private String sex;
    private Integer age;
}
