package com.gatsby.mybatisplus.service;

import com.gatsby.mybatisplus.entity.Employee;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */

public interface EmployeeService {
    String hello();
    List<Employee> queryAllEmployees();
}