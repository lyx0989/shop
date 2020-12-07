package com.goktech.olala.core.service;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.core.resp.RespCategoryVo;

import java.util.List;

/**
 * @Classname IGoodCategory
 * @Description TODO
 * @Date 2020/12/4 4:31 下午
 * @Created by mac
 */
public interface  IGoodCategory {
    public  List<RespCategoryVo>  betreeList();
     public List<RespBrandVo> selectBrand();
}
