package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xiaodu
 */
@Data
@ApiModel(value = "用户登录类",description = "请求类")
public class UserDto {

    @ApiModelProperty(value = "测试用例的name列表",example = "xiaodu",required = true)
    private String name;
    @ApiModelProperty(value = "测试用例的密码",example = "123",required = true)
    private String pwd;


}
