package com.notfound.crm.sys.service;

import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.common.service.IBaseService;
import com.notfound.crm.sys.domain.Customertransfer;
import com.notfound.crm.sys.form.CustomertransferFrom;
import com.notfound.crm.sys.form.PotentialcustomerForm;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/12 10:24
 * @Version 1.0
 * @Description
 */
public interface ICustomertransferService extends IBaseService<CustomertransferFrom> {
    Result inputAndUpdate(CustomertransferFrom customertransferFrom, PotentialcustomerForm potentialcustomerForm);
}
