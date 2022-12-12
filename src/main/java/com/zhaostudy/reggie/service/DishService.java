package com.zhaostudy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaostudy.reggie.dto.DishDto;
import com.zhaostudy.reggie.entity.Dish;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/8
 * @project com.zhaostudy.reggie.service
 * @description http:www.cnblogs.com/zhaostudy
 */
public interface DishService extends IService<Dish> {

    /**
     * 新增菜品，同时插入菜品对应的口味数据，需要操作两张表，dish，dish_flavor
     * @param dishDto
     */
    public void saveWithFlavor(DishDto dishDto);

    /**
     * 根据id查询菜品信息和对应的口味信息
     * @param id
     * @return
     */
    public DishDto getByIdWithFlavor(Long id);

    /**
     * 更新菜品信息和口味信息
     * @param dishDto
     */
    public void updateWithFlavor(DishDto dishDto);
}
