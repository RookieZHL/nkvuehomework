package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserDao extends Mapper<User> {

    // 1. 基于注解的方式
    //@Select("select * from user")
    List<User> getUser();
}
