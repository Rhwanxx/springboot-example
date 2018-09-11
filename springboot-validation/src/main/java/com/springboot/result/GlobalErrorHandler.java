package com.springboot.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 17:30
 */
@RestControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler(value = GlobalErrorException.class)
    public BaseResult errorHandler(HttpServletRequest request,GlobalErrorException exception){
       ErrorService errorService = exception.getErrorService();
       BaseResult result = new BaseResult(errorService);
       return result;
    }
}
