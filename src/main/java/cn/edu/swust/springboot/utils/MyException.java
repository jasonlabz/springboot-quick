package cn.edu.swust.springboot.utils;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

@Data
@Slf4j
public class MyException extends RuntimeException{
    private static final long serialVersionUID = -6979901566637669960L;

    private ExceptionEnum exceptionEnum;

    private String code;

    private String message;

    public MyException(String code,String message){
        super(message);
        this.code = code;
        this.message = message;
    }

    public MyException(ExceptionEnum exceptionEnum){
        super(exceptionEnum.message);
        this.exceptionEnum = exceptionEnum;
        this.code = exceptionEnum.code;
        this.message = exceptionEnum.message;
    }


    public MyException(String code,String message,Throwable throwable){
        super(message,throwable);
        this.code = code;
        this.message = message;
    }

    public MyException(ExceptionEnum exceptionEnum,Throwable throwable){
        super(exceptionEnum.message,throwable);
        this.exceptionEnum = exceptionEnum;
    }


    /**
     * @description TODO 重写Throwable中printStackTrace方法，打印异常信息
     * @return void
     * @date 2020/6/8下午7:57
     * @author zzg
     */
    @Override
    public void printStackTrace(){
        if (exceptionEnum != null){
            log.info("异常代码: {}, 异常信息: {}",exceptionEnum.code,exceptionEnum.message);
            return;
        }
        log.info("异常代码: {}, 异常信息: {}",code,message);
    }
}
