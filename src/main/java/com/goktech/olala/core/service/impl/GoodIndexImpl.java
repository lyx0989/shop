package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.req.ReqGoodKeywords;
import com.goktech.olala.core.service.IGoodIndex;
import com.goktech.olala.server.dao.goods.GoodsMapper;
import com.goktech.olala.server.pojo.goods.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GoodIndexImpl
 * @Description TODO
 * @Date 2020/12/7 8:26 上午
 * @Created by mac
 */
@Service
public class GoodIndexImpl implements IGoodIndex {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> selectByKeywords(ReqGoodKeywords goodsName) {
        List<Goods> goods = goodsMapper.selectByKeywords(goodsName);
        return goods;
    }
}
