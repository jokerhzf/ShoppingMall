package com.hzf.mall.tiny.common;

/**
 * @author：010980380
 * @date:2020-4-2
 * @verison:1.0.0
 * @description：通用返回对象
 */

public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
