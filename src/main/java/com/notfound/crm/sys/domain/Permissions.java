package com.notfound.crm.sys.domain;

/**
 * @author Wen
 * @Create 2021-05-10 10:09
 * @Description:
 */
public class Permissions {
    /**
     * 权限ID
     */
    private Integer id;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限表达含义
     */
    private String expression;

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

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
