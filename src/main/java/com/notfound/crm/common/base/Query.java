package com.notfound.crm.common.base;

/**
 * @author Wan_JiaLin
 * @Create 2021-04-30 10:34
 * @Description:    这是查询基类，包括有分页条件，模糊查询关键字，模糊查询类型种类
 */
public class Query {
    /**
     * 当前页码
     */
    private Integer currentPage;
    /**
     * 每页显示条数
     */
    private Integer pageSize;
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


    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
}
