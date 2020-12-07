package com.goktech.olala.server.dao.goods;

import com.goktech.olala.server.pojo.goods.Activit;
import java.util.List;

public interface ActivitMapper {
    int deleteByPrimaryKey(Integer activitId);

    int insert(Activit record);

    Activit selectByPrimaryKey(Integer activitId);

    List<Activit> selectAll();

    int updateByPrimaryKey(Activit record);
}