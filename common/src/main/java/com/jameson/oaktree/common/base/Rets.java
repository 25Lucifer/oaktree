package com.jameson.oaktree.common.base;

/**
 * @author zhangshu
 * @date 2022-01-17 16:34
 */
public class Rets {

    public static final Integer SUCCESS = 0;
    public static final Integer FAILURE = 1;

    public static Ret success(Object data) {
        return new Ret(SUCCESS, "成功", data, true);
    }
    public static Ret success(Object data, String msg) {
        return new Ret(SUCCESS, msg, data, true);
    }
    public static Ret failure(String msg) {
        return new Ret(FAILURE, msg, null, false);
    }
}
