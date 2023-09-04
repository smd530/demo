package com.example.demo.convert;

import com.example.demo.dataobject.UserDO;
import com.example.demo.dto.UserDTO;
import com.example.demo.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * User 转换器
 * @author shanmingda
 */
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserDTO convertDTO(UserVO userVO);

    UserDO convertDO(UserDTO userDTO);



}
