package com.notfound.crm.sys.util.query;

import com.notfound.crm.common.base.Query;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Zhengxiaolong
 * @Date 2021/5/12 18:28
 * @Version 1.0
 * @Description 新增时间查询功能
 */
public class ExtendsQuery extends Query {
    /**
     * 查询的开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;
    /**
     * 查询的结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /**
     * 员工身份标识
     */
    private Integer self;

    /***
     *查询部门所有潜在客户的
     */
    private Long deptId;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getSelf() {
        return self;
    }

    public void setSelf(Integer self) {
        this.self = self;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "ExtendsQuery{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", self=" + self +
                ", deptId=" + deptId +
                '}';
    }
}
