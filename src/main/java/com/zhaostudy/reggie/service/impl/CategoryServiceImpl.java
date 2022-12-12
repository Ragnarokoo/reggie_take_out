package com.zhaostudy.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaostudy.reggie.common.CustomException;
import com.zhaostudy.reggie.entity.Category;
import com.zhaostudy.reggie.entity.Dish;
import com.zhaostudy.reggie.entity.Setmeal;
import com.zhaostudy.reggie.mapper.CategoryMapper;
import com.zhaostudy.reggie.service.CategoryService;
import com.zhaostudy.reggie.service.DishService;
import com.zhaostudy.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/8
 * @project com.zhaostudy.reggie.service.impl
 * @description http:www.cnblogs.com/zhaostudy
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类，删除之前需要进行判断！
     * @param id
     */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        // 添加过滤条件，根据id进行查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        // 查询当前分类是否关联了菜品，如果已经关联，抛出一个业务异常
        if (count1 > 0) {
            // 已经关联，抛出一个业务异常
            throw new CustomException("当前分类下已经关联了菜品，不能删除！");
        }

        // 查询当前分类是否关联了套餐，如果已经关联，抛出一个业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        // 添加过滤条件，根据id进行查询
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        if (count2 > 0) {
            // 已经关联套餐，抛出一个异物异常！
            throw new CustomException("当前分类下已经关联了套餐，不能删除！");
        }

        // 正常删除分类
        super.removeById(id);
    }
}
