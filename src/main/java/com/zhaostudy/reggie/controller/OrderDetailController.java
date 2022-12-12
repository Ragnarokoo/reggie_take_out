package com.zhaostudy.reggie.controller;

import com.zhaostudy.reggie.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * 订单详情
 * @author coder_hook丶
 * @date 2022/12/12
 * @project com.zhaostudy.reggie.controller
 * @description http:www.cnblogs.com/zhaostudy
 */
@Slf4j
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;
}
