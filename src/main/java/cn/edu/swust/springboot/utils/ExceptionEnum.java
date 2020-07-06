package cn.edu.swust.springboot.utils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ExceptionEnum {
    OBJECT_NOT_FOUND_EXCEPTION("object is null","对象实例不存在"),
    USER_NOT_FOUND("user not found exception","用户不存在"),

    USER_ALREADY_EXIST("user already_exist","用户已经存在");
    public final String code;
    public final String message;
}
