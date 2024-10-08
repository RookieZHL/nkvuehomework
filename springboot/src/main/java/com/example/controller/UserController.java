package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * controller里的一个方法，它其实就是我们平常说的web项目的一个接口的入口
     * 可以在这个方法上再加上一个url
     * 也可以指定请求方式：GET POST PUT DELETE
     * @return
     */
    @GetMapping("/start")
    public String start() {
        return "欢迎来到武哥的直播间，关注B站：武哥聊编程，一键三连+关注支持一波 ！！！";
    }

    @GetMapping("/getUser")
    public List<User> getUser() {
        return userService.getUser();
    }
}
