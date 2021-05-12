package com.notfound.crm.sys.service.impl;

import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.CustomertransferFrom;
import com.notfound.crm.sys.mapper.CustomertransferMapper;
import com.notfound.crm.sys.service.ICustomertransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/12 10:26
 * @Version 1.0
 * @Description
 */
@Service
public class ICustomertransferServiceImpl extends BaseServiceImpl<CustomertransferFrom> implements ICustomertransferService {
    @Autowired
    private CustomertransferMapper customertransferMapper;
    public ICustomertransferServiceImpl(CustomertransferMapper customertransferMapper) {
        super(customertransferMapper);
    }
}
