package com.springboot.result;

/**
 * 统一错误码返回
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/11 17:27
 */
public class GlobalErrorException extends Exception{

    private ErrorService errorService;

    public GlobalErrorException(ErrorService errorService){
        this.errorService=errorService;
    }

    public ErrorService getErrorService() {
        return errorService;
    }

    public void setErrorService(ErrorService errorService) {
        this.errorService = errorService;
    }
}
