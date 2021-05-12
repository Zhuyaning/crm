package com.notfound.crm.sys.service.impl;

import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.CustomertraceForm;
import com.notfound.crm.sys.mapper.CustomertraceMapper;
import com.notfound.crm.sys.service.ICustomertraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
