package com.goktech.olala.server.dao.goods;

import com.goktech.olala.server.pojo.goods.Article;
import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    Article  selectByPrimaryKey(Integer articleId);

    List<Article> selectAll();

    int updateByPrimaryKey(Article record);
}