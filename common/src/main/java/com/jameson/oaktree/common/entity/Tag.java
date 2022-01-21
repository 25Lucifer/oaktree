package com.jameson.oaktree.common.entity;

import com.jameson.oaktree.common.base.BaseEntity;

/**
 * @author zhangshu
 * @date 2022-01-21 11:05
 */
public class Tag extends BaseEntity {

    private String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
