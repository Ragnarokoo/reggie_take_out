package com.zhaostudy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaostudy.reggie.entity.Employee;
import com.zhaostudy.reggie.mapper.EmployeeMapper;
import com.zhaostudy.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/6
 * @project com.zhaostudy.reggie.service.impl
 * @description http:www.cnblogs.com/zhaostudy
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
