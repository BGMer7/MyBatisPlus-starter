package com.gatsby.jpa.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

/**
 * @classname ServerResponse
 * @description:
 * @author: bgm
 * @create: 2022/9/23
 **/

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable {
    private int code;

    private String msg;

    private T data;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServerResponse {" +
                "code='" + this.code + '\'' +
                ", msg='" + this.msg + '\'' +
                ", data=" + this.data +
                '}';
    }
}
