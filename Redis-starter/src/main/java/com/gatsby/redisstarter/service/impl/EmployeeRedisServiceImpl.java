package com.gatsby.redisstarter.service.impl;

import com.gatsby.redisstarter.constant.RedisConstant;
import com.gatsby.redisstarter.entity.Employee;
import com.gatsby.redisstarter.mapper.EmployeeMapper;
import com.gatsby.redisstarter.service.EmployeeRedisService;
import com.gatsby.redisstarter.service.EmployeeService;
import com.gatsby.redisstarter.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author -- gatsby
 * @date -- 2022/6/15
 * @description --
 */

@Slf4j
@Service
public class EmployeeRedisServiceImpl implements EmployeeRedisService {
    @Resource
    private RedisUtil redisUtil;

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployees() {
        log.info("get all employee");
        List<Employee> employeeList = (List<Employee>) redisUtil.get(RedisConstant.ALL_USER_KEY);
        if (CollectionUtils.isEmpty(employeeList)) {
            employeeList = employeeMapper.queryAll();
            redisUtil.set(RedisConstant.ALL_USER_KEY, employeeList, 30);
        }
        return employeeList;
    }

    @Override
    public void updateEmployeeSalary() {
        log.info("update employee salary");
    }

    @Override
    public void deleteAllUserKey() {
        redisUtil.del(RedisConstant.ALL_USER_KEY);
    }

    @Override
    public boolean hasKey(String key) {
        return redisUtil.hasKey(key);
    }
}