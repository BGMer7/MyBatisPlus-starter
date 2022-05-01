package com.gatsby.mybatisstarter.service.impl;

import com.gatsby.mybatisstarter.entity.Employee;
import com.gatsby.mybatisstarter.mapper.EmployeeMapper;
import com.gatsby.mybatisstarter.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/5/1
 * @description --
 */

@Service
public class EmpolyeeServiceImpl implements EmployeeService {
    EmployeeMapper employeeMapper;

    public EmpolyeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> queryAll() {
        return employeeMapper.queryAll();
    }

    @Override
    public void insert(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public List<Employee> queryByName(String firstname, String lastname) {
        return employeeMapper.queryByName(firstname, lastname);
    }

    @Override
    public List<Employee> queryBySex(String sex) {
        return employeeMapper.queryBySex(sex);
    }

    @Override
    public List<Employee> queryByDept(String deptno) {
        return employeeMapper.queryByDept(deptno);
    }

    @Override
    public List<Employee> hiredAfterAsc(String hiredate) {
        return employeeMapper.hiredAfterAsc(hiredate);
    }

    @Override
    public List<Employee> hiredAfterDesc(String hiredate) {
        return employeeMapper.hiredAfterDesc(hiredate);
    }

    @Override
    public List<Employee> hiredBeforeAsc(String hiredate) {
        return employeeMapper.hiredBeforeAsc(hiredate);
    }

    @Override
    public List<Employee> hiredBeforeDesc(String hiredate) {
        return employeeMapper.hiredBeforeDesc(hiredate);
    }
}