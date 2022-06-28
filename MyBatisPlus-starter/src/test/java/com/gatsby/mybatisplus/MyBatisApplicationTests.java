package com.gatsby.mybatisplus;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.gatsby.mybatisplus.entity.Employee;
import com.gatsby.mybatisplus.entity.User;
import com.gatsby.mybatisplus.mapper.EmployeeMapper;
import com.gatsby.mybatisplus.mapper.UserMapper;
import com.gatsby.mybatisplus.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.gatsby.mybatisplus.mapper")
class MyBatisApplicationTests {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private EmployeeMapper employeeMapper;

    @Autowired(required = false)
    private EmployeeService employeeService;


    @Test
    @DS("mybatisplus")
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testQueryAllEmployee(){
        System.out.println(("----- selectAll method test ------"));
        List<Employee> employeeList = employeeMapper.queryAllEmployees();
        System.out.println(employeeList.size());

        // employeeList = employeeService.queryAllEmployees();
        // System.out.println(employeeList.size());
    }

    @Test
    public void print() {
        System.out.println("test");
    }

}
