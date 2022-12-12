package com.zhaostudy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaostudy.reggie.entity.Orders;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/12
 * @project com.zhaostudy.reggie.service
 * @description http:www.cnblogs.com/zhaostudy
 */
public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
