package com.gatsby.mybatisstarter.service;

import com.gatsby.mybatisstarter.entity.Employee;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/5/1
 * @description --
 */


public interface EmployeeService {
    List<Employee> queryAll();

    void insert(Employee employee);

    List<Employee> queryByName(String firstname, String lastname);

    List<Employee> queryBySex(String sex);

    List<Employee> queryByDept(String deptno);

    List<Employee> hiredAfterAsc(String hiredate);

    List<Employee> hiredAfterDesc(String hiredate);

    List<Employee> hiredBeforeAsc(String hiredate);

    List<Employee> hiredBeforeDesc(String hiredate);
}