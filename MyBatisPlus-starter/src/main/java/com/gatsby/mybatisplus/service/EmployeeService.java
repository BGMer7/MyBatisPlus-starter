package com.gatsby.mybatisplus.service;

import com.gatsby.mybatisplus.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */

public interface EmployeeService {
    List<Employee> queryAllEmployees();
}