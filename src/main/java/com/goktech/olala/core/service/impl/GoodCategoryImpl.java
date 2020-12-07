package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.core.resp.RespCategoryVo;
import com.goktech.olala.core.service.IGoodCategory;
import com.goktech.olala.server.dao.goods.BrandMapper;
import com.goktech.olala.server.dao.goods.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname GoodCategoryImpl
 * @Description TODO
 * @Date 2020/12/4 4:33 下午
 * @Created by mac
 */
@Service
public class GoodCategoryImpl implements IGoodCategory {
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    BrandMapper brandMapper;
    //查询实力商家
    @Override
    public List<RespBrandVo> selectBrand() {
        List<RespBrandVo> respBrandVos = brandMapper.selectBrand();
        return  respBrandVos;
    }
    //查询一级菜单
    @Override
    public List<RespCategoryVo> betreeList() {
        List<RespCategoryVo> firstList = categoryMapper.selectByCategory();
        List<RespCategoryVo> secondList =null;
        List<RespCategoryVo> thirdList =null;
        for (RespCategoryVo first :firstList) {
            String categoryIdArr= first.getCategoryIdArr();
            String[] split = categoryIdArr.split(",");
            secondList=new ArrayList<>();
            for (String cateId:split) {
                Integer categoryId = Integer.valueOf(cateId);
//             根据categoryId查二级目录list
                List<RespCategoryVo> child = categoryMapper.sellectByA(categoryId);
                if(child!=null){
                    secondList.addAll(child);
                    for (RespCategoryVo second:child){
                        Integer categoryId1 = second.getCategoryId();
                        List<RespCategoryVo> threeList = categoryMapper.sellectByA(categoryId1);
                        second.setChildList(threeList);
                    }
                    secondList.addAll(child);
                }
                first.setChildList(secondList);
            }
        }
        return firstList;
    }


}
