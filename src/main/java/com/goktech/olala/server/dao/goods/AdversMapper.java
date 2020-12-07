package com.goktech.olala.server.dao.goods;

import com.goktech.olala.server.pojo.goods.Advers;
import java.util.List;

public interface AdversMapper {
    int deleteByPrimaryKey(Integer adverId);

    int insert(Advers record);

    Advers selectByPrimaryKey(Integer adverId);

    List<Advers> selectAll();

    int updateByPrimaryKey(Advers record);
}