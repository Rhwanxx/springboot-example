package com.springboot.service;

import com.springboot.domain.UserInfo;

import java.util.List;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/12 10:49
 */
public interface RedisBootService {
    List<UserInfo> getAllUser();

    UserInfo getUserById(int userId);
}
