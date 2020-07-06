/**
 * Copyright (C), 2017-2020, 西南科技大学
 * FileName: ResultUtil
 * Author:   Jeff
 * Date:     2020/5/26 14:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.edu.swust.springboot.utils;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Jeff
 * @create 2020/5/26
 * @since 1.0.0
 */
public class ResultUtil{
    public static Result<Object> success(Object object) {
        Result<Object> result = new Result<>();
        result.setStatus(ResultEnum.SUCCESS.getStatus());
        result.setSuccess(true);
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result<Object> success() {
        return success(null);
    }

    public static Result<Object> error(Integer status, String msg) {
        Result<Object> result = new Result<>();
        result.setStatus(status);
        result.setSuccess(false);
        result.setMsg(msg);
        return result;
    }
}
