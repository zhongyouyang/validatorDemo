package com.demo.validator.hanlder;

import com.demo.validator.model.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(BindException.class)
    public Result handleBindException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        return Result.fail(bindingResult.getFieldError().getDefaultMessage());
    }
}
