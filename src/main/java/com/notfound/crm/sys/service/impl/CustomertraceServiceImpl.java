package com.notfound.crm.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.notfound.crm.common.base.ExcendsQuery;
import com.notfound.crm.common.base.PageInfo;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.CustomertraceForm;
import com.notfound.crm.sys.mapper.CustomertraceMapper;
import com.notfound.crm.sys.service.ICustomertraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/12
 *   Time: 8:38
 */
@Service
public class CustomertraceServiceImpl extends BaseServiceImpl<CustomertraceForm> implements ICustomertraceService {

    @Autowired
    CustomertraceMapper mapper;

    public CustomertraceServiceImpl(CustomertraceMapper mapper) {
        super(mapper);
    }
}
