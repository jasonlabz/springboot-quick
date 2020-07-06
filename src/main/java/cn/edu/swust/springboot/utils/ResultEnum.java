/**
 * Copyright (C), 2017-2020, 西南科技大学
 * FileName: ResultSetEnum
 * Author:   Jeff
 * Date:     2020/5/26 11:04
 * Description: 结果集枚举类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.edu.swust.springboot.utils;
public enum ResultEnum {
    /**
     * 服务器响应状态信息  *
     */
    SUCCESS(200, "Successful"),
    INSERT_SUCCESS(200, "Insert successful"),
    UPDATE_SUCCESS(200, "Update successful"),
    DELETE_SUCCESS (200, "Delete successful"),
    UPLOAD_SUCCESS (200, "Upload successful"),
    DOWNLOAD_SUCCESS (200, "Download successful"),
    LOGIN_SUCCESS (200, "Login successful"),
    LOGOUT_SUCCESS (200, "Logout successful"),


    LOGIN_ERROR (201, "Login error"),
    LOGIN_EXPIRE (202, "Login expire"),
    ARGS_ERROR(501, "Error args"),
    UNKOWN_ERROR (502, "System error"),
    INSERT_ERROR (503, "Insert error"),
    UPDATE_ERROR (504, "Update error"),
    DELETE_ERROR (506, "Delete error"),
    UPLOAD_ERROR (507, "Upload error"),
    DOWNLOAD_ERROR(508, "Download error"),
    WAIT(111, "正在处理结果");
    /**
     *   属性
     */
    private Integer status;
    private String msg;

    ResultEnum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}