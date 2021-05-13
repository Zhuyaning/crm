package com.notfound.crm.sys.domain;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/**
 * @author Wan_JiaLin
 * @Create 2021-05-08 15:28
 * @Description: employee员工实体类
 */
public class Employee {
    /**
     * ID
     */
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 部门
     */
    private Long dept;

    /**
     * 入职日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;

    /**
     * 入职时间：1 正常，0 离职
     */
    private Integer state;

    /**
     * 超级管理员身份：1 超级管理员，0普通员工
     */
    private Integer admin;

    /**
     * 角色
     */
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getDept() {
        return dept;
    }

    public void setDept(Long dept) {
        this.dept = dept;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                ", hiredate=" + hiredate +
                ", state=" + state +
                ", admin=" + admin +
                ", role=" + role +
                '}';
    }
}