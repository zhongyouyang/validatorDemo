package com.demo.validator.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Result<T> {

    @ApiModelProperty("状态码")
    private String code;

    @ApiModelProperty("提示信息")
    private String message;

    @ApiModelProperty("返回数据")
    private T data;

    public static <T> Result<T> ok(T t) {
        Result<T> result = new Result<>();
        result.setCode("200");
        result.setMessage("OK");
        result.setData(t);
        return result;
    }

    public static Result fail(String message) {
        Result result = new Result<>();
        result.setCode("-1");
        result.setMessage(message);
        return result;
    }
}
