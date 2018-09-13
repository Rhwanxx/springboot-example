package com.springboot.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/13 15:54
 */
@Document(indexName = "userinfoindex", type = "userInfo")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 78000039543242L;

    private int id;

    private int userId;

    private String userName;

    private String memo;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
