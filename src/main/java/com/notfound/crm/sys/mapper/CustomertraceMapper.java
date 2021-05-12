package com.notfound.crm.sys.mapper;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.sys.form.CustomertraceForm;
import com.notfound.crm.sys.vo.CustomertraceVO;

import java.util.List;

public interface CustomertraceMapper extends BaseMapper<CustomertraceForm, CustomertraceVO> {

    List<CustomertraceVO> selectListSelf(Query query);
}