package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.service.IAdversService;
import com.goktech.olala.server.dao.goods.AdversMapper;
import com.goktech.olala.server.pojo.goods.Advers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname IAdversServiceImpl
 * @Description TODO
 * @Date 2020/12/4 2:48 下午
 * @Created by mac
 */
@Service
public class AdversServiceImpl implements IAdversService {
    @Autowired
    AdversMapper adversMapper;
    @Override
    public List<Advers> selectAll() {
        List<Advers> advers = adversMapper.selectAll();
        return advers;
    }
}
