package com.goktech.olala.server.pojo.goods;

import java.util.Date;

public class Goods {
    private String goodsId;

    private String goodsSn;

    private String goodsName;

    private String goodsTitle;

    private String keywords;

    private String catyId;

    private String catySn;

    private String businessSn;

    private Date effectiveDate;

    private Integer expiryDays;

    private String goodsBrief;

    private Integer marketPrice;

    private Integer discount;

    private Integer shopPrice;

    private Integer costPrice;

    private Integer promotePrice;

    private Date promoteStartDate;

    private Date promoteEndDate;

    private String couponSn;

    private Integer isDel;

    private Integer isOnsale;

    private Integer isComment;

    private Integer shipFee;

    private Integer sortOrl;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String goodsDesc;

    private String imgPath;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getCatyId() {
        return catyId;
    }

    public void setCatyId(String catyId) {
        this.catyId = catyId == null ? null : catyId.trim();
    }

    public String getCatySn() {
        return catySn;
    }

    public void setCatySn(String catySn) {
        this.catySn = catySn == null ? null : catySn.trim();
    }

    public String getBusinessSn() {
        return businessSn;
    }

    public void setBusinessSn(String businessSn) {
        this.businessSn = businessSn == null ? null : businessSn.trim();
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Integer getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(Integer expiryDays) {
        this.expiryDays = expiryDays;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief == null ? null : goodsBrief.trim();
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Integer shopPrice) {
        this.shopPrice = shopPrice;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(Integer promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Date getPromoteStartDate() {
        return promoteStartDate;
    }

    public void setPromoteStartDate(Date promoteStartDate) {
        this.promoteStartDate = promoteStartDate;
    }

    public Date getPromoteEndDate() {
        return promoteEndDate;
    }

    public void setPromoteEndDate(Date promoteEndDate) {
        this.promoteEndDate = promoteEndDate;
    }

    public String getCouponSn() {
        return couponSn;
    }

    public void setCouponSn(String couponSn) {
        this.couponSn = couponSn == null ? null : couponSn.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsOnsale() {
        return isOnsale;
    }

    public void setIsOnsale(Integer isOnsale) {
        this.isOnsale = isOnsale;
    }

    public Integer getIsComment() {
        return isComment;
    }

    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    public Integer getShipFee() {
        return shipFee;
    }

    public void setShipFee(Integer shipFee) {
        this.shipFee = shipFee;
    }

    public Integer getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(Integer sortOrl) {
        this.sortOrl = sortOrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}