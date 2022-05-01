package com.gatsby.mybatisstarter.controller;

import com.gatsby.mybatisstarter.entity.Employee;
import com.gatsby.mybatisstarter.mapper.EmployeeMapper;
import com.gatsby.mybatisstarter.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/5/1
 * @description --
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/query-all")
    public List<Employee> queryAll() {
        return employeeService.queryAll();
    }

    @PostMapping("/insert")
    public void insert(Employee employee) {
        employeeService.insert(employee);
    }

    @GetMapping("/query-by-name")
    public List<Employee> queryByName(String firstname, String lastname) {
        return employeeService.queryByName(firstname, lastname);
    }

    @GetMapping("/query-by-sex")
    public List<Employee> queryBySex(String sex) {
        return employeeService.queryBySex(sex);
    }

    @GetMapping("/query-by-dept")
    public List<Employee> queryByDept(String deptno) {
        return employeeService.queryByDept(deptno);
    }

    @GetMapping("/hired-after-asc")
    public List<Employee> hiredAfterAsc(String hiredate) {
        return employeeService.hiredAfterAsc(hiredate);
    }

    @GetMapping("/hired-after-desc")
    public List<Employee> hiredAfterDesc(String hiredate) {
        return employeeService.hiredAfterDesc(hiredate);
    }

    @GetMapping("/hired-before-asc")
    public List<Employee> hiredBeforeAsc(String hiredate) {
        return employeeService.hiredBeforeAsc(hiredate);
    }

    @GetMapping("/hired-before-desc")
    public List<Employee> hiredBeforeDesc(String hiredate) {
        return employeeService.hiredBeforeDesc(hiredate);
    }
}