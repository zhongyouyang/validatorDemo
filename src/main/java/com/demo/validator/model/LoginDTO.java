package com.demo.validator.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@ApiModel("登录")
public class LoginDTO {

    @NotEmpty(message = "手机号码不能为空")
    @Pattern(regexp = "^[1][3,5,7,8][0-9]\\\\d{8}$", message = "手机号码格式不正确")
    @ApiModelProperty(value = "手机号码", required = true)
    private String mobile;

    @ApiModelProperty(value = "tenantCode")
    private String tenantCode;

    @ApiModelProperty(value = "authgroupid")
    private String authgroupid;

    @NotEmpty(message = "验证码不能为空")
    @ApiModelProperty(value = "验证码", required = true)
    private String verifyCode;
}
