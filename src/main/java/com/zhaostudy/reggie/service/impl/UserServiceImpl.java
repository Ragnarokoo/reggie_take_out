package com.zhaostudy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaostudy.reggie.entity.User;
import com.zhaostudy.reggie.mapper.UserMapper;
import com.zhaostudy.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/10
 * @project com.zhaostudy.reggie.service.impl
 * @description http:www.cnblogs.com/zhaostudy
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
