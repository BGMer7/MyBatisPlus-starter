package com.gatsby.mybatisplus.controller;

import com.gatsby.mybatisplus.entity.Employee;
import com.gatsby.mybatisplus.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Autowired
    @Qualifier("employeeServiceImpl")
    private EmployeeService employeeService;

    @GetMapping("/hello")
    public String sayHello() {
        return employeeService.hello();
    }

    @GetMapping("/query-all-employee")
    public List<Employee> queryAllEmployee() {
        return employeeService.queryAllEmployees();
    }
}