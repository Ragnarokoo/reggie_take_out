package com.zhaostudy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaostudy.reggie.entity.Category;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/8
 * @project com.zhaostudy.reggie.service
 * @description http:www.cnblogs.com/zhaostudy
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long id);
}
