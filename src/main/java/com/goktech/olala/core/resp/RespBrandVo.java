package com.goktech.olala.core.resp;

/**
 * @Classname RespBrandVo
 * @Description TODO
 * @Date 2020/12/6 5:01 下午
 * @Created by mac
 */
public class RespBrandVo {
    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "RespBrandVo{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
