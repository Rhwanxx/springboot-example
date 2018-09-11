package com.springboot.constant;

import com.springboot.result.ErrorService;

/**
 * 全局错误处理枚举
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 17:25
 */
public enum GlobalErrorEnum implements ErrorService {

    SUCCESS("0", "success"),

    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
