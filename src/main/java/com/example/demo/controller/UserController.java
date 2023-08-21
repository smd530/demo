package com.example.demo.controller;

import com.example.demo.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shanmingda
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/list")
    public List<UserVO> list() {
        // 查询列表
        List<UserVO> result = new ArrayList<>();

        UserVO user1 = new UserVO();
        user1.setId(1);
        user1.setName("卡卡罗特");

        UserVO user2 = new UserVO();
        user2.setId(2);
        user2.setName("贝吉塔");

        result.add(user1);
        result.add(user2);
        return result;
    }

    @GetMapping("/{id}")
    public UserVO get(@PathVariable("id") Integer id) {
        // 查询并返回用户
        UserVO user = new UserVO();
        user.setId(id);
        user.setName("卡卡罗特");
        return user;
    }
}
