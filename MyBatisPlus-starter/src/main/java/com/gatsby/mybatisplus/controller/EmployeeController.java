package com.gatsby.mybatisplus.controller;

import com.gatsby.mybatisplus.entity.Employee;
import com.gatsby.mybatisplus.mapper.EmployeeMapper;
import com.gatsby.mybatisplus.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description --
 */


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    private EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/query-all-employee")
    public List<Employee> queryAllEmployee() {
        return employeeService.queryAllEmployees();
        // return employeeMapper.queryAllEmployees();
    }
}