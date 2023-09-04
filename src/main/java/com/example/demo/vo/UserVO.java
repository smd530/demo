package com.example.demo.vo;

import java.util.Date;
import java.util.Objects;

/**
 * @author shanmingda
 */
public class UserVO {

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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public UserVO() {
    }

    public UserVO(Integer id, String name, String password, Date createTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
