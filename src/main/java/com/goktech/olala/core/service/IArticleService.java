package com.goktech.olala.core.service;

import com.goktech.olala.server.pojo.goods.Article;

import java.util.List;

/**
 * @Classname IArticleService
 * @Description TODO
 * @Date 2020/12/3 9:23 下午
 * @Created by mac
 */
public interface IArticleService {
    public List<Article> selectAll();
}
