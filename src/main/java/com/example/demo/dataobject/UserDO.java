package com.example.demo.dataobject;

import lombok.Data;

import java.util.Date;

/**
 * @author shanmingda
 */
@Data
public class UserDO {

    /**
     * id
     */
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
