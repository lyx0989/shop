package com.goktech.olala.server.dao.goods;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.server.pojo.goods.Brand;
import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(Brand record);

    Brand selectByPrimaryKey(Integer brandId);

    List<Brand> selectAll();

    /**
     * 查品牌名
     * @param record
     * @return
     */
    int updateByPrimaryKey(Brand record);
    List<RespBrandVo> selectBrand();
}