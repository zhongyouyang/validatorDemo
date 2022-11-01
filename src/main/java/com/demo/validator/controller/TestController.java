package com.demo.validator.controller;

import com.demo.validator.model.LoginDTO;
import com.demo.validator.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"测试模块"})
@RestController
public class TestController {

    @ApiOperation(value = "登录", notes = "测试一下登录数据校验")
    @PostMapping("/login")
    public Result<LoginDTO> login(@Validated @RequestBody LoginDTO login) {
        return Result.ok(login);
    }

}
