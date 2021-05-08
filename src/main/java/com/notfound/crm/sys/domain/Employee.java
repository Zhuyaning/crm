package com.notfound.crm.sys.domain;

import java.util.Date;

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
    private Long role;

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

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }
}