package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
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
     * 新增客户移交记录，同时修改相应内容
     * @param customertransferFrom
     * @param potentialcustomerForm
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(CustomertransferFrom customertransferFrom, PotentialcustomerForm potentialcustomerForm, Integer id){
        Result query = employeeService.query(id);
        Result query1 = potentialcustomerService.query(id);
        ValidatorUtil.validator(customertransferFrom);
        Result add = customertransferService.add(customertransferFrom);
        ValidatorUtil.validator(potentialcustomerForm);
        Result update = potentialcustomerService.update(potentialcustomerForm);
        Map<String,Result> map = new HashMap<String,Result>();
        map.put("query1",query1);
        map.put("query",query);
        map.put("add",add);
        map.put("update",update);
        Result result = new Result();
        result.setData(map);
        return result;
    }

}
