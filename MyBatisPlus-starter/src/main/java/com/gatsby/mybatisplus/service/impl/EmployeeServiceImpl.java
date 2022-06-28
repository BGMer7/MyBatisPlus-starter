package com.gatsby.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.gatsby.mybatisplus.entity.Employee;
import com.gatsby.mybatisplus.mapper.EmployeeMapper;
import com.gatsby.mybatisplus.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */


@DS("java")
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAllEmployees() {
        System.out.println("service");
        List<Employee> result = employeeMapper.queryAllEmployees();
        System.out.println("The size of result is: "+ result.size());
        return result;
    }
}