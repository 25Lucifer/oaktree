package com.jameson.oaktree.common.entity;

import com.jameson.oaktree.common.base.BaseEntity;

/**
 * @author zhangshu
 * @date 2022-01-17 17:11
 */
public class Blog extends BaseEntity {

    private String title;
    private String mdContent;
    private String htmlContent;
    private Integer views;
    private Boolean allowComments;
    private Boolean published;
    private Boolean recommend;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMdContent() {
        return mdContent;
    }

    public void setMdContent(String mdContent) {
        this.mdContent = mdContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Boolean getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(Boolean allowComments) {
        this.allowComments = allowComments;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }
}
