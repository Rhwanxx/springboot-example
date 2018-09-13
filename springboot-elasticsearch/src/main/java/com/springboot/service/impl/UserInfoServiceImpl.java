package com.springboot.service.impl;

import com.springboot.domain.UserInfo;
import com.springboot.repository.UserInfoRepository;
import com.springboot.service.UserInfoService;
import org.elasticsearch.index.query.ExistsQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 查询用户信息
     *
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    @Override
    public List<UserInfo> searchUser(Integer pageNumber, Integer pageSize, String searchContent) {

        //分页信息
        Pageable pageable = new PageRequest(pageNumber, pageSize);

        /*// Function Score Query
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("userName", searchContent)),
                        ScoreFunctionBuilders.weightFactorFunction(1000))
                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("memo", searchContent)),
                        ScoreFunctionBuilders.weightFactorFunction(100));*/

        QueryStringQueryBuilder queryStringQueryBuilder = QueryBuilders.queryStringQuery(searchContent);//existsQuery(searchContent);
        // 创建搜索 DSL 查询
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withPageable(pageable).withQuery(queryStringQueryBuilder).build();


        Page<UserInfo> searchPageResults = userInfoRepository.search(searchQuery);
        return searchPageResults.getContent();
    }
}
