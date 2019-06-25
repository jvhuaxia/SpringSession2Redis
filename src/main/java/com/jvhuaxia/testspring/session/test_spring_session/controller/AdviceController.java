package com.jvhuaxia.testspring.session.test_spring_session.controller;

import com.jvhuaxia.testspring.session.test_spring_session.dto.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceController {
    @ExceptionHandler(Exception.class)
    public Result<String> exceptionHandle() {
        return new Result<>(false, 0, "出现错误啦,请联系服务员");
    }
}
