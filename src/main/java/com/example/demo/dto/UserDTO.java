package com.example.demo.dto;

import lombok.Data;

import java.util.Date;

/**
 * User Data Transfer Object
 * @author shanmingda
 */
@Data
public class UserDTO {

    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 密码（明文）
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;
}
