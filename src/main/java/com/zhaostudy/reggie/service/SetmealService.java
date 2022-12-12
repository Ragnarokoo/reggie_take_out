package com.zhaostudy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaostudy.reggie.dto.SetmealDto;
import com.zhaostudy.reggie.entity.Setmeal;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/8
 * @project com.zhaostudy.reggie.service
 * @description http:www.cnblogs.com/zhaostudy
 */
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
