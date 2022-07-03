package com.gatsby.mybatisplus.service.impl;

import com.gatsby.mybatisplus.entity.Employee;
import com.gatsby.mybatisplus.mapper.EmployeeMapper;
import com.gatsby.mybatisplus.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    @Qualifier("employeeMapper")
    private EmployeeMapper employeeMapper;

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public List<Employee> queryAllEmployees() {
        List<Employee> result = employeeMapper.queryAllEmployees();
        log.info("The size of all employee query result is: "+ result.size());
        return result;
    }
}