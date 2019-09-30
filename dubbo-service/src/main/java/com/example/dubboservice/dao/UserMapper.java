package com.example.dubboservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dubboservice.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Function description
 *
 * @Author: Vampire-潘伟
 * @Data: 2019/9/10 19:28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
