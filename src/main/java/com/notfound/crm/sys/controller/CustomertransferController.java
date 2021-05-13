package com.notfound.crm.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.notfound.crm.sys.domain.Customertransfer;
import com.notfound.crm.sys.domain.Employee;
import com.notfound.crm.sys.domain.Potentialcustomer;
import com.notfound.crm.sys.form.EmployeeForm;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.form.CustomertransferFrom;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.service.ICustomertransferService;
import com.notfound.crm.sys.service.IEmployeeService;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/12 11:19
 * @Version 1.0
 * @Description
 */
@Controller
@RequestMapping("/custran")
public class CustomertransferController {
    @Autowired
    private ICustomertransferService customertransferService;
    @Autowired
    private IPotentialcustomerService potentialcustomerService;
    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/list")
    @ResponseBody
    public Result list(ExtendsQuery eq){
        Result result = customertransferService.queryPage(eq);
        return result;
    }

    /**
     * 新增客户移交记录，同时修改相应内容
     * @param customertransferFrom
     * @param potentialcustomerForm
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(CustomertransferFrom customertransferFrom, PotentialcustomerForm potentialcustomerForm, Integer id, Employee employee){
//        Result query = employeeService.query(id);
////        String customer = object.get("customer").toString();
////        String transUser = object.get("transUser").toString();
//        Result query1 = potentialcustomerService.query(id);
//        ValidatorUtil.validator(customertransferFrom);
////        potentialcustomerForm.setName(customer);
////        employee.setName(transUser);
////        customertransferFrom.setCustomer(potentialcustomerForm);
////        customertransferFrom.setTransUser(employee);
//        Result add = customertransferService.add(customertransferFrom);
//        ValidatorUtil.validator(potentialcustomerForm);
//        Result update = potentialcustomerService.update(potentialcustomerForm);
//        Map<String,Result> map = new HashMap<String,Result>();
//        map.put("query1",query1);
//        map.put("query",query);
//        map.put("add",add);
//        map.put("update",update);
//        Result result = new Result();
//        result.setData(map);
//        Customertransfer customertransfer = new Customertransfer();
//        Potentialcustomer customer = new Potentialcustomer();
//        customer.setName(customertransferFrom.getCustomer());
//        customertransfer.setCustomer(customer);
//        customertransfer.setTransReason(customertransferFrom.getTransReason());
//
//        customertransferService.inputAndUpdate(customertransfer,potentialcustomerForm);
        potentialcustomerForm.setSeller(customertransferFrom.getNewSeller());
        Result result = customertransferService.inputAndUpdate(customertransferFrom, potentialcustomerForm);
        return result;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Integer id){
        ValidatorUtil.validator(id);
        Result delete = customertransferService.delete(id);
        return delete;
    }
}
