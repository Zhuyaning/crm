package com.notfound.crm.common.domin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Employee {
    private Integer id;         //员工id
    private String name;        //员工姓名
    private String password;    //密码
    private String email;       //邮箱
    private Integer age;        //年龄
    private Long dept;          //部门
    private Date hireDate;      //入职时间
    private Integer state;      //状态（1正常，0离职）
    private Integer admin;      //超级管理员身份（1超级管理员，0普通）
    private Long role;          //多对多关系
}