package com.gatsby.redisstarter.controller;

import com.gatsby.redisstarter.entity.Employee;
import com.gatsby.redisstarter.service.EmployeeRedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/15
 * @description --
 */


@Slf4j
@RestController
@RequestMapping("/redis")
public class EmployeeRedisController {
    private EmployeeRedisService employeeRedisService;

    public EmployeeRedisController(EmployeeRedisService employeeRedisService) {
        this.employeeRedisService = employeeRedisService;
    }

    @GetMapping("/query-all")
    public List<Employee> queryAll() {
        return employeeRedisService.getAllEmployees();
    }

    @GetMapping("/delete-all-user-key")
    public void deleteAllUserKey() {
        employeeRedisService.deleteAllUserKey();
    }

    @GetMapping("/has-key")
    public boolean deleteAllUserKey(@RequestParam String key) {
        return employeeRedisService.hasKey(key);
    }
}