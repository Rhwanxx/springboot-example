package com.springboot.service.impl;

import com.springboot.dao.UserInfoMapper;
import com.springboot.domain.UserInfo;
import com.springboot.service.RedisBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/12 10:50
 */
@Service
public class RedisBootServiceImpl implements RedisBootService {

    private static final Logger logger = LoggerFactory.getLogger(RedisBootServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<UserInfo> getAllUser() {
        return userInfoMapper.getAll();
    }

    @Override
    public UserInfo getUserById(int userId) {
        //从缓存中获取用户信息
        String key = "user_"+userId;
        ValueOperations<String,UserInfo> operations = redisTemplate.opsForValue();

        //判断缓存是否存在
        Boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey){
            UserInfo userInfo = operations.get(key);
            logger.info("用户信息从缓存中获取》》"+userInfo.toString());
            return userInfo;
        }

        //缓存中不存在，从数据库中获取
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);

        // 插入缓存
        operations.set(key,userInfo);
        logger.info("用户信息从DB中获取》》"+userInfo.toString());
        return userInfo;
    }
}
