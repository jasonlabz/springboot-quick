/**
 * Copyright (C), 2017-2020, 西南科技大学
 * FileName: Result
 * Author:   Jeff
 * Date:     2020/5/26 10:14
 * Description: 服务器响应结果集封装
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.edu.swust.springboot.utils;

import lombok.Data;

@Data
public class Result<T> {
    /**
     * 状态码
     */
    private Integer status;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private  T data;
    /**
     * 成功与否
     */
    private Boolean success;
}
