package com.zhaostudy.reggie.common;

/**
 * Created with IntelliJ IDEA.
 * 自定义业务异常类
 * @author coder_hook丶
 * @date 2022/12/8
 * @project com.zhaostudy.reggie.common
 * @description http:www.cnblogs.com/zhaostudy
 */
public class CustomException extends RuntimeException{
    public CustomException (String message) {
        super(message);
    }
}
