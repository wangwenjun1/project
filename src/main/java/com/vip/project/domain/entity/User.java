package com.vip.project.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    private Integer uid;

    private String username;

    private String password;

    private Date lastLogin;

    private String icon;

    private Date creatDate;

    private Integer status;

    private String email;
}