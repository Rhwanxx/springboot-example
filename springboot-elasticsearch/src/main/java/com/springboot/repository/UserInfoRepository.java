package com.springboot.repository;

import com.springboot.domain.UserInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/9/13 15:56
 */
@Repository
public interface UserInfoRepository extends ElasticsearchRepository<UserInfo,Long> {
}
