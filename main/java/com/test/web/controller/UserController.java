package com.test.web.controller;

import com.test.web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/count")
    public String count(){
        int count = service.UserCount();

        return count+""; // 인티져 타입+빈문자열은 = 문자열 이 됨
    }

    
}