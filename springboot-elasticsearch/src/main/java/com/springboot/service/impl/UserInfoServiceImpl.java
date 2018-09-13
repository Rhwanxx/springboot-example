package com.springboot.service.impl;

import com.springboot.domain.UserInfo;
import com.springboot.repository.UserInfoRepository;
import com.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/13 15:56
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public String saveUserIfo(UserInfo userInfo) {
        UserInfo result = userInfoRepository.save(userInfo);
        return result.toString();
    }
}
