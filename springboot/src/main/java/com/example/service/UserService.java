package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public List<User> getUser() {
//        return userDao.getUser();
        // 3. 使用引入的包
        return userDao.selectAll();
    }
}
