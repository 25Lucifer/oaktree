package com.jameson.oaktree.common.entity;

import com.jameson.oaktree.common.base.BaseEntity;

/**
 * @author zhangshu
 * @date 2022-01-21 11:05
 */
public class Category extends BaseEntity {

    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
