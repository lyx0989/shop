package com.goktech.olala.core.service;

import com.goktech.olala.core.req.ReqGoodKeywords;
import com.goktech.olala.server.pojo.goods.Goods;

import java.util.List;

/**
 * @Classname IGoodIndex
 * @Description TODO
 * @Date 2020/12/7 8:25 上午
 * @Created by mac
 */
public interface IGoodIndex {
    List<Goods> selectByKeywords(ReqGoodKeywords goodsName);
}
