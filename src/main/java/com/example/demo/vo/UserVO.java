package com.example.demo.vo;

import java.util.Objects;

/**
 * @author shanmingda
 */
public class UserVO {

    /**
     * id
     */
    private Integer id;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 名字
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserVO(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public UserVO() {
    }

    public UserVO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
