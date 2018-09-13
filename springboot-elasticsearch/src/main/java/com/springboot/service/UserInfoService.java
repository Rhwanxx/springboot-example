package com.springboot.service;

import com.springboot.domain.UserInfo;

import java.util.List;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/13 15:55
 */
public interface UserInfoService {

    /**
     * 新增用户信息
     *
     * @param userInfo
     * @return
     */
    String saveUserIfo(UserInfo userInfo);

    /**
     * 查询用户信息
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    List<UserInfo> searchUser(Integer pageNumber, Integer pageSize, String searchContent);
}
