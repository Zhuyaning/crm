package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.domain.Employee;
import com.notfound.crm.sys.form.CustomertransferFrom;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.service.ICustomertransferService;
import com.notfound.crm.sys.service.IEmployeeService;
import com.notfound.crm.sys.service.IPermissionsService;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/12 19:37
 * @Version 1.0
 * @Description 客户资源池信息
 */
@Controller
@RequestMapping("/custPool")
public class CustomerPool {
    @Autowired
    private IPotentialcustomerService potentialcustomerService;
    @Autowired
    private ICustomertransferService customertransferService;
    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/list")
    @ResponseBody
    public Result list(Query query){
        Result result = potentialcustomerService.queryPage(query);
        return result;
    }

    /**
     * 新增客户移交记录，同时修改相应内容 移交功能
     * @param customertransferFrom
     * @param potentialcustomerForm
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(CustomertransferFrom customertransferFrom, PotentialcustomerForm potentialcustomerForm, Integer id, HttpSession session){
        Employee curr_user = (Employee) session.getAttribute("CURR_USER");

        potentialcustomerForm.setSeller(customertransferFrom.getNewSeller());

        customertransferFrom.setTransUser(curr_user.getName());
        customertransferFrom.setTransTime(new Date());
        Result result = customertransferService.inputAndUpdate(customertransferFrom, potentialcustomerForm);
        return result;
    }

}
