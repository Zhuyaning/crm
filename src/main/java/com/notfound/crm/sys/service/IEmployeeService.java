package com.notfound.crm.sys.service;

import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.service.IBaseService;
import com.notfound.crm.sys.form.EmployeeForm;
import com.notfound.crm.sys.vo.EmployeeVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Wan_JiaLin
 * @Create 2021-04-30 10:12
 * @Description:    User的服务层接口
 */
public interface IEmployeeService extends IBaseService<EmployeeForm>{
    /**
     * 登录接口
     * @param employeeForm
     * @param request
     * @return
     */
    Result login(EmployeeForm employeeForm,String securityCode, HttpServletRequest request);

    /**
     * 选择更新接口
     * @param employeeVO
     * @return
     */
    Result updateByPrimaryKeySelective(EmployeeVO employeeVO);

    /**
     * 批量删除数据
     * @return
     */
    Result deleteByIdList(Integer[] ids);

}
