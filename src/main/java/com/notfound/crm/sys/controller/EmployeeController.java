package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Result;
import com.notfound.crm.sys.form.EmployeeForm;
import com.notfound.crm.sys.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Wan_JiaLin
 * @Create 2021-04-30 10:09
 * @Description:
 */
@Controller
@RequestMapping("sys")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @RequestMapping("/login")
    @ResponseBody
    public Result login(EmployeeForm employeeForm){

        Result result = employeeServiceImpl.login(employeeForm);

        return result;
    }

}
