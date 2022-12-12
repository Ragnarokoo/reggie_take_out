package com.zhaostudy.reggie.dto;

import com.zhaostudy.reggie.entity.Orders;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/12
 * @project com.zhaostudy.reggie.dto
 * @description http:www.cnblogs.com/zhaostudy
 */
@Data
public class OrdersDto extends Orders {

    private int sumNum;
}
