package com.goktech.olala.core.resp;

import java.util.List;

/**
 * @Classname RespCategory
 * @Description TODO
 * @Date 2020/12/4 4:01 下午
 * @Created by mac
 */
public class  RespCategoryVo {
    private String categoryIdArr;
    private String categoryName;
    private String catyDesc;
    private Integer categoryId;
    private List<RespCategoryVo> childList;//二三级目录
    private List<RespBrandVo> brandList;

    public List<RespBrandVo> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<RespBrandVo> brandList) {
        this.brandList = brandList;
    }

    public List<RespCategoryVo> getChildList() {
        return childList;
    }

    public void setChildList(List<RespCategoryVo> childList) {
        this.childList = childList;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryIdArr() {
        return categoryIdArr;
    }

    public void setCategoryIdArr(String categoryIdArr) {
        this.categoryIdArr = categoryIdArr;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCatyDesc() {
        return catyDesc;
    }

    public void setCatyDesc(String catyDesc) {
        this.catyDesc = catyDesc;
    }
}
