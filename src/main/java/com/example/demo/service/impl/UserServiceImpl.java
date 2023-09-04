package com.example.demo.service.impl;

import com.example.demo.convert.UserConvert;
import com.example.demo.dataobject.UserDO;
import com.example.demo.dto.UserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * User 业务层
 * @author shanmingda
 */
//@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(UserDTO userDTO) {
        // 一些校验
        Assert.notNull(userDTO.getId(), "ID不能为空！");
        // 转换
        UserDO userDO = UserConvert.INSTANCE.convertDO(userDTO);
        // 更新
        userMapper.updateById(userDO);

    }
}
