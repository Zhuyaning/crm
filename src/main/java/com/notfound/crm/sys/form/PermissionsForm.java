package com.notfound.crm.sys.form;

import com.notfound.crm.sys.domain.Permissions;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Wen
 * @Create 2021-05-10 10:10
 * @Description:
 */
public class PermissionsForm extends Permissions {
    /**
     * 权限ID
     */
    private Integer id;
    /**
     * 权限名称
     */
    @NotBlank(message = "权限名称不能为空！")
    private String name;
    /**
     * 权限表达含义
     */
    @NotBlank(message = "权限表达含义不能为空！")
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
