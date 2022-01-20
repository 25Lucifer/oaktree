package com.jameson.oaktree.common.entity;

import com.jameson.oaktree.common.base.BaseEntity;

import java.util.Date;

/**
 * @author zhangshu
 * @date 2022-01-19 10:57
 */
public class Comment extends BaseEntity {

    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private String website;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
