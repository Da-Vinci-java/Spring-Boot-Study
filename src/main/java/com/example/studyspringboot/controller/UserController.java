package com.example.studyspringboot.controller;

import com.example.studyspringboot.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
//类跨域
//    @CrossOrigin("http://127.0.0.1:5500")
public class UserController {

    @Resource
    private User user;

    @GetMapping("hello")
    public String hello(){
        System.out.println(user);
        return user.getName();
        }

    @GetMapping("api/getMsg")
    //方法跨域
//    @CrossOrigin("http://127.0.0.1:5500")
    public String api(){
        return "hello cross";
    }
}
