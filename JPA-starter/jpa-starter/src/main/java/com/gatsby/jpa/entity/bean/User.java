package com.gatsby.jpa.entity.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @classname User
 * @description:
 * @author: bgm
 * @create: 2022/9/23
 **/

@Data
@Entity
@Table(name = "user")
// 实体类都应该实现序列化
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user_name", length = 200)
    private String userName;

    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    // 实体类应该带有无参构造函数和全参构造函数
    public User() {}

    public User(int id, String userName, String password, int sex, Date lastLoginTime) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.lastLoginTime = lastLoginTime;
    }


}
