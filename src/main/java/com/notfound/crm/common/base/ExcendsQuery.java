package com.notfound.crm.common.base;

import java.util.Date;

/**
 * @author Zhengxiaolong
 * @Date 2021/5/12 18:28
 * @Version 1.0
 * @Description 新增时间查询功能
 */
public class ExcendsQuery extends Query{
    /**
     * 查询的开始时间
     */
    private Date startTime;
    /**
     * 查询的结束时间
     */
    private Date endTime;

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
}
