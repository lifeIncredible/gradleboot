package com.atguigu.boot.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class UserController {

    @GetMapping("/name")
    public String getActorName(){

        return "梁朝伟";
    }
}
