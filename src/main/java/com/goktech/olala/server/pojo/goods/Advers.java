package com.goktech.olala.server.pojo.goods;

import java.util.Date;

public class Advers {
    private Integer adverId;//

    private String title;

    private String adverType;

    private String adverImg;

    private String adverContent;

    private String linkUrl;

    private Byte sortOrder;

    private Date startTime;

    private Date endTime;

    private String linkMan;

    private String linkEmail;

    private String linkPhone;

    private Integer clickCount;

    private Integer isShow;//

    private Integer isEnabled;//

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    public Integer getAdverId() {
        return adverId;
    }

    public void setAdverId(Integer adverId) {
        this.adverId = adverId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdverType() {
        return adverType;
    }

    public void setAdverType(String adverType) {
        this.adverType = adverType;
    }

    public String getAdverImg() {
        return adverImg;
    }

    public void setAdverImg(String adverImg) {
        this.adverImg = adverImg;
    }

    public String getAdverContent() {
        return adverContent;
    }

    public void setAdverContent(String adverContent) {
        this.adverContent = adverContent;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
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
        this.createBy = createBy;
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
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "Advers{" +
                "adverId=" + adverId +
                ", title='" + title + '\'' +
                ", adverType='" + adverType + '\'' +
                ", adverImg='" + adverImg + '\'' +
                ", adverContent='" + adverContent + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", sortOrder=" + sortOrder +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", linkMan='" + linkMan + '\'' +
                ", linkEmail='" + linkEmail + '\'' +
                ", linkPhone='" + linkPhone + '\'' +
                ", clickCount=" + clickCount +
                ", isShow=" + isShow +
                ", isEnabled=" + isEnabled +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}