package com.cathy.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by 陈敬 on 2017/3/24.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public String NotFoundHandler()
    {
        return "error/404.html";
    }

    @ExceptionHandler(Exception.class)
    public String ErrorHandler(){
        return "error/error.html";
    }
}
