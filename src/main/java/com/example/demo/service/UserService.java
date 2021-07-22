package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;

/**
 * @author xiaodu
 */
@Service
public interface UserService {

     String login(UserDto userDto);


}
