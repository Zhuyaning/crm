package com.notfound.crm.sys.domain;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Wen
 * @Create 2021-05-10 10:08
 * @Description:
 */
public class Role {
    /**
     * 角色id
     */
    private Integer id;
    /**
     * 角色编号
     */
    private String sn;
    /**
     * 角色姓名
     */
    private String name;
    /**
     * 通过权限name连接
     */
    private String permission;

    /**
     * 员工表连接
     */
    private List<Employee> employeeList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
