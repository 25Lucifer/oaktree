package com.jameson.oaktree.common.base;

import java.util.Date;

/**
 * @author zhangshu
 * @date 2022-01-17 16:09
 */
public class BaseEntity {

    private Long id;

    private Date createDate;

    private String createBy;

    private Date modifyDate;

    private String modifyBy;

    public BaseEntity() {
    }

    public BaseEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy) {
        this.id = id;
        this.createDate = createDate;
        this.createBy = createBy;
        this.modifyDate = modifyDate;
        this.modifyBy = modifyBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }
}
