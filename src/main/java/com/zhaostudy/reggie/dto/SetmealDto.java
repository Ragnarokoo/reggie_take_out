package com.zhaostudy.reggie.dto;

import com.zhaostudy.reggie.entity.Setmeal;
import com.zhaostudy.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
