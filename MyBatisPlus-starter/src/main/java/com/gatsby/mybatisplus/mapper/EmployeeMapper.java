package com.gatsby.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gatsby.mybatisplus.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description -- EmployeeMapper
 */


@Mapper
@Repository
public interface EmployeeMapper extends BaseMapper<Employee>{
    List<Employee> queryAllEmployees();
}