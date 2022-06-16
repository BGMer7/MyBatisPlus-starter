package com.gatsby.redisstarter.service;

import com.gatsby.redisstarter.entity.Employee;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/15
 * @description --
 */


public interface EmployeeRedisService {
    List<Employee> getAllEmployees();

    void updateEmployeeSalary();

    void deleteAllUserKey();

    boolean hasKey(String key);
}