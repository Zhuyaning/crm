package com.notfound.crm.sys.form;

import com.notfound.crm.sys.domain.Permissions;
import com.notfound.crm.sys.domain.Role;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Wen
 * @Create 2021-05-10 10:09
 * @Description:
 */
public class RoleForm extends Role {
    /**
     * 角色id
     */
    private Integer id;
    /**
     * 角色编号
     */
    @NotBlank(message = "角色编号不能为空！")
    private String sn;
    /**
     * 角色姓名
     */
    @NotBlank(message = "角色姓名不能为空！")
    private String name;
    /**
     * 权限关系连接
     */
    private String permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPermission() {
        return permission;
    }

    @Override
    public void setPermission(String permission) {
        this.permission = permission;
    }
}
