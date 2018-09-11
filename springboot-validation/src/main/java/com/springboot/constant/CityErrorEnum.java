package com.springboot.constant;

import com.springboot.result.ErrorService;

/**
 * 异常枚举
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 17:18
 */
public enum CityErrorEnum implements ErrorService {

    PARAMS_NO_COMPLETE("4000","参数不合法"),

    CITY_EXIT("4001","城市错误");

    private String code;

    private String message;

    CityErrorEnum(String code, String message) {
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
