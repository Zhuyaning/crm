package com.notfound.crm.sys.service.impl;

import com.notfound.crm.sys.mapper.EmployeeMapper;
import com.notfound.crm.common.base.CodeMsg;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.service.impl.BaseServiceImpl;
import com.notfound.crm.sys.form.EmployeeForm;
import com.notfound.crm.sys.service.IEmployeeService;
import com.notfound.crm.sys.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wan_JiaLin
 * @Create 2021-04-30 10:12
 * @Description:    User服务层实现类
 */
@Service
public class EmployeeServiceImpl extends BaseServiceImpl<EmployeeForm> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    //告诉基类当前需要用到的Mapper文件
    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
        super(employeeMapper);
    }

    /**
     * 登录方法
     * @param employeeForm
     * @return
     */
    public Result login(EmployeeForm employeeForm){
        EmployeeVO data = employeeMapper.login(employeeForm);
        if(data == null){   //查询记过如果为空，则该用户名错误
            return new Result(CodeMsg.LOGIN_FAILD_WRONG_USERNAME);    //登录失败，用户名错误
        }else { //查询结果不为空，证明改用户名正确
            //判断该用户名对应的密码是否与数据库中的密码相同，如果相同，那么则允许该用户登录系统，若不相同则返回错误信息
            if(data.getPassword().equals(employeeForm.getPassword())){
                return new Result();    //登录成功
            }else {
                return new Result(CodeMsg.LOGIN_FAILD_WRONG_PASSWORD); //登录失败，密码错误
            }
        }
    }
}
