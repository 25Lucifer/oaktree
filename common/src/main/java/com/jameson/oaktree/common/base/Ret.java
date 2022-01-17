package com.jameson.oaktree.common.base;

import java.io.Serializable;

/**
 * @author zhangshu
 * @date 2022-01-17 16:28
 */
public class Ret<T> implements Serializable {

    protected Integer code;
    protected String msg;
    protected T data;
    protected boolean success;

    public Ret() {
    }

    public Ret(Integer code, String msg, T data, boolean success) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
