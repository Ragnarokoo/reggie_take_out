package com.zhaostudy.reggie.common;

/**
 * Created with IntelliJ IDEA.
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 * @author coder_hook丶
 * @date 2022/12/8
 * @project com.zhaostudy.reggie.common
 * @description http:www.cnblogs.com/zhaostudy
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
