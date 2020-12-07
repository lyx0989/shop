package com.goktech.olala.server.dao.goods;

import com.goktech.olala.core.resp.RespCategoryVo;
import com.goktech.olala.server.pojo.goods.Category;
import java.util.List;

public interface   CategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    Category selectByPrimaryKey(Integer categoryId);

    List<Category> selectAll();

    int updateByPrimaryKey(Category record);
    List<RespCategoryVo> selectByCategory();
    List<RespCategoryVo>  sellectByA(Integer parendId);
}