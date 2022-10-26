package com.gatsby.jpa.common;

/**
 * @classname ServerResponseUtils
 * @description:
 * @author: bgm
 * @create: 2022/9/23
 **/

public class ServerResponseUtils {
    public static <T> ServerResponse<T> success(T t) {
        ServerResponse<T> response = new ServerResponse<>();
        response.setCode(1);
        response.setMsg("success");
        response.setData(t);
        return response;
    }
}
