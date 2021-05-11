package com.notfound.crm.sys.domain;

import java.util.Date;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/11 23:00
 * @Version 1.0
 * @Description 客户移交记录
 */
public class Customertransfer {
    private Integer id;                     //移交记录编号
    private Potentialcustomer customer;     //客户
    private Employee transUser;             //移交人员
    private Date transTime;                 //移交时间
    private String  oldSeller;             //老市场专员
    private String  newSeller;             //新市场专员
    private String transReason;             //移交原因

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Potentialcustomer getCustomer() {
        return customer;
    }

    public void setCustomer(Potentialcustomer customer) {
        this.customer = customer;
    }

    public Employee getTransUser() {
        return transUser;
    }

    public void setTransUser(Employee transUser) {
        this.transUser = transUser;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public String getOldSeller() {
        return oldSeller;
    }

    public void setOldSeller(String oldSeller) {
        this.oldSeller = oldSeller;
    }

    public String getNewSeller() {
        return newSeller;
    }

    public void setNewSeller(String newSeller) {
        this.newSeller = newSeller;
    }

    public String getTransReason() {
        return transReason;
    }

    public void setTransReason(String transReason) {
        this.transReason = transReason;
    }

    @Override
    public String toString() {
        return "Customertransfer{" +
                "id=" + id +
                ", customer=" + customer +
                ", transUser=" + transUser +
                ", transTime=" + transTime +
                ", oldSeller='" + oldSeller + '\'' +
                ", newSeller='" + newSeller + '\'' +
                ", transReason='" + transReason + '\'' +
                '}';
    }
}
