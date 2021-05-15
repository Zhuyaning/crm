package com.notfound.crm.sys.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Potentialcustomer {
    /**
    * ID
    */
    private Long id;

    /**
    * 客户姓名
    */
    private String name;

    /**
    * 客户年龄
    */
    private Integer age;

    /**
    * 客户年龄：1 男，0女
    */
    private Integer gender;

    /**
    * 电话号码
    */
    private String tel;

    /**
    * qq号码
    */
    private String qq;

    /**
    * 职业
    */
    private String job;

    /**
    * 客户来源
    */
    private String source;

    /**
    * 负责人
    */
    private String seller;

    /**
    * 创建人
    */
    private String inputuser;

    /**
    * 创建时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inputtime;

    /**
    * 客户状态：-2:流失，-1:开发失败，0:潜在客户，1:正式客户，2:资源池客户

    */
    private Integer status;

    /**
    * 转正时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date positivetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getInputuser() {
        return inputuser;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPositivetime() {
        return positivetime;
    }

    public void setPositivetime(Date positivetime) {
        this.positivetime = positivetime;
    }

    @Override
    public String toString() {
        return "Potentialcustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", tel='" + tel + '\'' +
                ", qq='" + qq + '\'' +
                ", job='" + job + '\'' +
                ", source='" + source + '\'' +
                ", seller='" + seller + '\'' +
                ", inputuser='" + inputuser + '\'' +
                ", inputtime=" + inputtime +
                ", status=" + status +
                ", positivetime=" + positivetime +
                '}';
    }
}