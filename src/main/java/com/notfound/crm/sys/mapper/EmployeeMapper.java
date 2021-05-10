package com.notfound.crm.sys.mapper;

import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.mapper.BaseMapper;
import com.notfound.crm.sys.form.EmployeeForm;
import com.notfound.crm.sys.vo.EmployeeVO;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper extends BaseMapper<EmployeeForm, EmployeeVO> {
    /**
     * 登录接口
     * @param employeeForm
     * @return
     */
    EmployeeVO login(EmployeeForm employeeForm);

    /**
     * 注销或退出登录接口
     * @param employeeVO
     * @return
     */
    int updateByPrimaryKeySelective(EmployeeVO employeeVO);

    /**
     * 根据前端传入的id数组批量删除数据
     * @param ids
     * @return
     */
    int deleteByIdList(@Param("ids") Integer[] ids);
}