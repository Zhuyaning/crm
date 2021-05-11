package com.notfound.crm.sys.domain;

import java.util.Date;

public class Customertrace {
    /**
    * ID
    */
    private Integer id;

    /**
    * 跟进时间
    */
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
    * 跟进客户
    */
    private String customerid;

    /**
    * 创建人
    */
    private String inputuser;

    /**
    * 跟进类型：0 潜在开发计划，1 客户跟进历史
    */
    private Integer type;

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

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getInputuser() {
        return inputuser;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
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
                ", customerid='" + customerid + '\'' +
                ", inputuser='" + inputuser + '\'' +
                ", type=" + type +
                '}';
    }
}