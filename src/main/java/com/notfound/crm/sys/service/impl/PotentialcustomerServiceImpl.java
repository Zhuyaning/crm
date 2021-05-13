package com.notfound.crm.sys.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.notfound.crm.common.base.PageInfo;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.mapper.PotentialcustomerMapper;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.sys.vo.QueryPageReportVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/10
 *   Time: 11:07
 */
@Service
public class PotentialcustomerServiceImpl extends BaseServiceImpl<PotentialcustomerForm> implements IPotentialcustomerService {

    @Autowired
    private PotentialcustomerMapper potentialcustomerMapper;

    public PotentialcustomerServiceImpl(PotentialcustomerMapper potentialcustomerMapper) {
        super(potentialcustomerMapper);
    }

    @Override
    public Result queryPageReport(ExtendsQuery query) {

        Page<Object> data = PageHelper.startPage(query.getCurrentPage(), query.getPageSize());

        List<QueryPageReportVO> list = potentialcustomerMapper.queryPageReport(query);

        PageInfo pageData = new PageInfo(data.getPageNum(), data.getPageSize(), data.getTotal(), data.getResult());

        return new Result(pageData);
    }
}
