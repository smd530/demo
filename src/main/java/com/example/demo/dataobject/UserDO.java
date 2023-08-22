package com.example.demo.dataobject;

import java.util.Date;

/**
 * @author shanmingda
 */
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

    public Integer getId() {
        return id;
    }

    public UserDO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserDO setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDO setPassword(String password) {
        this.password = password;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserDO setCreateTime(Date createTime) {
        this.createTime,my = createTime;
        return this;
    }
}
