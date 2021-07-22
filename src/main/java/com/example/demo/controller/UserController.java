package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiaodu
 */
@Api(tags = "测试")
@RestController
@RequestMapping("test")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("key1")
    private String key1;

    @ApiOperation("登录")
    @PostMapping(value = "login")
    public String login(@RequestBody UserDto userDto) {
        System.out.println("true = " );
        userService.login(userDto);
        System.out.println("key1 = " + key1);
        return "成功";
    }


}
