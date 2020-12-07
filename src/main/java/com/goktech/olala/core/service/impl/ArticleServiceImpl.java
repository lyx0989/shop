package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.service.IArticleService;
import com.goktech.olala.server.dao.goods.ArticleMapper;
import com.goktech.olala.server.pojo.goods.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname IArticleService
 * @Description TODO
 * @Date 2020/12/3 9:26 下午
 * @Created by mac
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public List<Article> selectAll() {
        List<Article> articles = articleMapper.selectAll();
        return articles ;
    }
}
