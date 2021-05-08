package com.notfound.crm.sys.mapper;

import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.sys.form.EmployeeForm;
import com.notfound.crm.sys.vo.EmployeeVO;

public interface EmployeeMapper extends BaseMapper<EmployeeForm, EmployeeVO> {
    EmployeeVO login(EmployeeForm employeeForm);
}