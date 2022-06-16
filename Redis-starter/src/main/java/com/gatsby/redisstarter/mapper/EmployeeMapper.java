package com.gatsby.redisstarter.mapper;

import com.gatsby.redisstarter.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/5/1
 * @description --
 */


@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> queryAll();

    void insert(Employee employee);

    List<Employee> queryByName(String firstname, String lastname);

    List<Employee> queryBySex(String sex);

    List<Employee> queryByDept(String deptno);

    List<Employee> hiredAfterAsc(String hiredate);

    List<Employee> hiredAfterDesc(String hiredate);

    List<Employee> hiredBeforeAsc(String hiredate);

    List<Employee> hiredBeforeDesc(String hiredate);

    void updateSalaryByName(String firstname, String lastname, String newSalary);
}