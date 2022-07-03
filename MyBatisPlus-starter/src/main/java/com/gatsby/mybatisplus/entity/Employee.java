package com.gatsby.mybatisplus.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author -- gatsby
 * @date -- 2022/6/28
 * @description -- java_mysql表Employees
 */


@Data
@TableName("employees")
public class Employee {
    @TableId(value = "empno", type = IdType.AUTO)
    private String empno;
    private String firstname;
    private String lastname;
    private String sex;
    private String birthdate;
    private String deptno;
    private String hiredate;
    private String title;
    private String salary;

    public String toString() {
        return firstname + " " + lastname;
    }
}