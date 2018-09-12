package com.springboot.domain;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 331817882624780922L;

    private Integer userId;

    private String userName;

    private String userClass;

    private String memo;

    public UserInfo(Integer userId, String userName, String userClass, String memo) {
        this.userId = userId;
        this.userName = userName;
        this.userClass = userClass;
        this.memo = memo;
    }

    public UserInfo() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass == null ? null : userClass.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userClass='" + userClass + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}