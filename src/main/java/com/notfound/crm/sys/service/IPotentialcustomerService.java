package com.notfound.crm.sys.service;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.service.IBaseService;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.sys.vo.QueryPageReportVO;

import java.util.List;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/10
 *   Time: 11:16
 */

public interface IPotentialcustomerService extends IBaseService<PotentialcustomerForm> {
    Result queryPageReport(ExtendsQuery query);
}
