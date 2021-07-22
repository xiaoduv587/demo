package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

/**
 * @author xiaodu
 */
@Component
public class UserImpl implements UserService {


    @Override
    public String login(UserDto userDto) {
        return userDto.toString();
    }
}
