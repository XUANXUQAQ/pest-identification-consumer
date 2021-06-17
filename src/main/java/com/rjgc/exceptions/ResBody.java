package com.rjgc.exceptions;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoyunjie
 * @date 2021-04-09 10:42
 */
@Data
public class ResBody<T> {
    /**
     * 响应代码
     */
    private int code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object result;

    private static Map<String, Object> RESULT_HOLDER = new HashMap<>();

    static {
        RESULT_HOLDER.put("pages", 1);
        RESULT_HOLDER.put("data", "");
    }

    @Override
    public String toString() {
        return "ResBody{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
