package com.test.web.serviceImpl;

import com.test.web.mapper.UserMapper;
import com.test.web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public int UserCount(){
        int count = mapper.selectCount();

        return count;
    }

    
}