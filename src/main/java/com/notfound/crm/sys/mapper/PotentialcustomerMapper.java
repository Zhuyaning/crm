package com.notfound.crm.sys.mapper;

import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.sys.vo.PotentialcustomerVO;
import com.notfound.crm.sys.vo.QueryPageReportVO;

import java.util.List;

public interface PotentialcustomerMapper extends BaseMapper<PotentialcustomerForm, PotentialcustomerVO> {
    List<QueryPageReportVO> queryPageReport(ExtendsQuery query);
}