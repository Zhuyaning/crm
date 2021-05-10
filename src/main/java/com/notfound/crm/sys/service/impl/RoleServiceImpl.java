package com.notfound.crm.sys.service.impl;

import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.RoleForm;
import com.notfound.crm.sys.mapper.RoleMapper;
import com.notfound.crm.sys.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wen
 * @Create 2021-05-10 10:13
 * @Description:
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleForm> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    public RoleServiceImpl(RoleMapper roleMapper) {
        super(roleMapper);
    }
}

