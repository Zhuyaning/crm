package com.notfound.crm.sys.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.notfound.crm.sys.domain.Employee;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Wan_JiaLin
 * @Create 2021-05-08 15:28
 * @Description: 用于接收查询到的数据
 */
@Data
@ColumnWidth(20)
public class EmployeeVO{
    /**
     * ID
     */
    @ExcelIgnore
    private Integer id;

    /**
     * 员工姓名
     */
    @ExcelProperty(value = "员工姓名")
    private String name;

    /**
     * 密码
     */
    @ExcelProperty(value = "密码")
    @ColumnWidth(20)
    private String password;

    /**
     * 邮箱
     */
    @ColumnWidth(25)
    @ExcelProperty(value = "邮箱")
    private String email;

    /**
     * 年龄
     */
    @ExcelProperty(value = "年龄")
    private Integer age;

    /**
     * 部门
     */
    @ExcelProperty(value = "部门")
    private Long dept;

    /**
     * 入职日期
     */
    @ColumnWidth(20)
    @ExcelProperty(value = "入职日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;

    /**
     * 状态：1 正常，0 离职
     */
    @ExcelProperty(value = "状态")
    private Integer state;

    /**
     * 超级管理员身份：1 超级管理员，0普通员工
     */
    @ExcelProperty(value = "是否超级管理员")
    private Integer admin;

    /**
     * 角色
     */
    @ExcelProperty(value = "角色")
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
