package com.zjw.blogtest.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一封装结果
 */

@Data
public class Result implements Serializable {

    private int code;   //200正常，非200异常
    private String msg;
    private Object data;

    //操作成功
    public static Result success(Object data){
        return success(200, "操作成功", data);
    }

    //操作失败
    public static Result fail(String msg){
        return success(400, msg, null);
    }

    //操作失败
    public static Result fail(String msg, Object data){
        return success(400, msg, data);
    }

    //操作成功
    public static Result success(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    //操作失败
    public static Result fail(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}
