package com.goktech.olala.server.dao.goods;

import com.goktech.olala.core.req.ReqGoodKeywords;
import com.goktech.olala.server.pojo.goods.Goods;
import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(String goodsId);

    int insert(Goods record);

    Goods selectByPrimaryKey(String goodsId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
    List<Goods> selectByKeywords(ReqGoodKeywords goodsName);
}