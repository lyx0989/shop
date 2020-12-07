package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.service.IActivitService;
import com.goktech.olala.server.dao.goods.ActivitMapper;
import com.goktech.olala.server.pojo.goods.Activit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ActivitServiceImpl
 * @Description TODO
 * @Date 2020/12/4 3:16 下午
 * @Created by mac
 */
@Service
public class ActivitServiceImpl implements IActivitService {
    @Autowired
    ActivitMapper activitMapper;
    @Override
    public List<Activit> selectAll() {
        List<Activit> activits = activitMapper.selectAll();
        return activits;
    }
}
