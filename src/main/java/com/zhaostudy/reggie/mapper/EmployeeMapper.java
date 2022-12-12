package com.zhaostudy.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaostudy.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author coder_hook丶
 * @date 2022/12/6
 * @project com.zhaostudy.reggie.mapper
 * @description http:www.cnblogs.com/zhaostudy
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
