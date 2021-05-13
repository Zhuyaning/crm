package com.notfound.crm.sys.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class Customertrace {
    /**
    * ID
    */
    private Integer id;

    /**
    * 跟进时间
    */

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date traceitime;

    /**
    * 跟进内容
    */
    private String tracedetails;

    /**
    * 跟进方式（数据字典）
    */
    private String tracetype;

    /**
    * 跟进效果：1 差，2 中，3 优 
    */
    private Integer traceresult;

    /**
    * 跟进客户对象
    */
    private Potentialcustomer customerid;

    /**
    * 创建人对象
    */
    private Employee inputuser;

    private int type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTraceitime() {
        return traceitime;
    }

    public void setTraceitime(Date traceitime) {
        this.traceitime = traceitime;
    }

    public String getTracedetails() {
        return tracedetails;
    }

    public void setTracedetails(String tracedetails) {
        this.tracedetails = tracedetails;
    }

    public String getTracetype() {
        return tracetype;
    }

    public void setTracetype(String tracetype) {
        this.tracetype = tracetype;
    }

    public Integer getTraceresult() {
        return traceresult;
    }

    public void setTraceresult(Integer traceresult) {
        this.traceresult = traceresult;
    }

    public Potentialcustomer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Potentialcustomer customerid) {
        this.customerid = customerid;
    }

    public Employee getInputuser() {
        return inputuser;
    }

    public void setInputuser(Employee inputuser) {
        this.inputuser = inputuser;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customertrace{" +
                "id=" + id +
                ", traceitime=" + traceitime +
                ", tracedetails='" + tracedetails + '\'' +
                ", tracetype='" + tracetype + '\'' +
                ", traceresult=" + traceresult +
                ", customerid=" + customerid +
                ", inputuser=" + inputuser +
                ", type=" + type +
                '}';
    }
}