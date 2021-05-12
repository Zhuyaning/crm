package com.notfound.crm.common.base;

import java.util.Date;

/**
 * @author Wan_JiaLin
 * @Create 2021-04-30 10:34
 * @Description:    这是查询基类，包括有分页条件，模糊查询关键字，模糊查询类型种类
 */
public class Query {
    /**
     * 当前页码，默认为1
     */
    private Integer currentPage = 1;
    /**
     * 每页显示条数，默认为10
     */
    private Integer pageSize = 10;
    /**
     * 从那一条数据开始查询
     */
    private Integer start;

    /**
     * 模糊查询关键字
     */
    private String keyword;
    /**
     * 模糊查询类型种类
     */
    private Long type;

    /**
     * 查询从什么时间开始
     */
    private Date startTime;

    /**
     * 从什么时间结束
     */
    private Date endTime;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        if(currentPage<=0){
            this.currentPage = 1;
        }else {
            this.currentPage = currentPage;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize<=0){
            this.pageSize = 5;
        }else {
            this.pageSize = pageSize;
        }
    }

    public Integer getStart() {
        return (currentPage-1)*pageSize;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

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
