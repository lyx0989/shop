package com.goktech.olala.server.pojo.goods;

import java.util.Date;

public class Article {
    private Integer articleId;

    private String articleTitle;

    private String prefTitle;

    private String keywords;

    private String author;

    private Integer articleType;

    private Integer articleColumn;

    private Integer articleSort;

    private String source;

    private String linkUrl;

    private Integer allowComments;

    private Date commentBeginTime;

    private Date commentEndTime;

    private Integer clickCount;

    private Integer reviewStatus;

    private Integer isEnabled;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String abstracts;

    private String content;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getPrefTitle() {
        return prefTitle;
    }

    public void setPrefTitle(String prefTitle) {
        this.prefTitle = prefTitle == null ? null : prefTitle.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getArticleColumn() {
        return articleColumn;
    }

    public void setArticleColumn(Integer articleColumn) {
        this.articleColumn = articleColumn;
    }

    public Integer getArticleSort() {
        return articleSort;
    }

    public void setArticleSort(Integer articleSort) {
        this.articleSort = articleSort;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public Integer getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(Integer allowComments) {
        this.allowComments = allowComments;
    }

    public Date getCommentBeginTime() {
        return commentBeginTime;
    }

    public void setCommentBeginTime(Date commentBeginTime) {
        this.commentBeginTime = commentBeginTime;
    }

    public Date getCommentEndTime() {
        return commentEndTime;
    }

    public void setCommentEndTime(Date commentEndTime) {
        this.commentEndTime = commentEndTime;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
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

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts == null ? null : abstracts.trim();
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", prefTitle='" + prefTitle + '\'' +
                ", keywords='" + keywords + '\'' +
                ", author='" + author + '\'' +
                ", articleType=" + articleType +
                ", articleColumn=" + articleColumn +
                ", articleSort=" + articleSort +
                ", source='" + source + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", allowComments=" + allowComments +
                ", commentBeginTime=" + commentBeginTime +
                ", commentEndTime=" + commentEndTime +
                ", clickCount=" + clickCount +
                ", reviewStatus=" + reviewStatus +
                ", isEnabled=" + isEnabled +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                ", abstracts='" + abstracts + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

}