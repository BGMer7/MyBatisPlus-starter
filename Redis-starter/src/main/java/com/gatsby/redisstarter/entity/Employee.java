package com.gatsby.redisstarter.entity;

import lombok.Data;

/**
 * @author -- gatsby
 * @date -- 2022/5/1
 * @description -- employee
 */

@Data
public class Employee {
    String empno;
    String firstname;
    String lastname;
    String sex;
    String birthdate;
    String deptno;
    String hiredate;
    String salary;
    String title;
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstname);
        stringBuilder.append(" ");
        stringBuilder.append(lastname);
        stringBuilder.append(", ");
        stringBuilder.append(sex);
        stringBuilder.append(", ");
        stringBuilder.append("born on ");
        stringBuilder.append(birthdate);
        stringBuilder.append(", hired in dept ");
        stringBuilder.append(deptno);
        stringBuilder.append(" ");
        stringBuilder.append("on ");
        stringBuilder.append(hiredate);
        stringBuilder.append(".");
        return stringBuilder.toString();
    }
}