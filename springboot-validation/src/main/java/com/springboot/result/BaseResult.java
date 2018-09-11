package com.springboot.result;

import com.springboot.constant.GlobalErrorEnum;

/**
 * 返回结果集统一格式
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 17:30
 */
public class BaseResult {

    //信息状态码
    private String code;

    //返回信息
    private String message;

    //返回结果
    private Object result;

    //正常返回的结果
    public BaseResult(Object result) {
        this.code = GlobalErrorEnum.SUCCESS.getCode();
        this.message = GlobalErrorEnum.SUCCESS.getMessage();
        this.result = result;
    }

    //异常返回的结果
    public BaseResult(ErrorService errorService) {
        this.code = errorService.getCode();
        this.message = errorService.getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
