package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.ExcendsQuery;
import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.form.CustomertransferFrom;
import com.notfound.crm.sys.service.ICustomertransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/list")
    @ResponseBody
    public Result list(ExcendsQuery eq){
        Result result = customertransferService.queryPage(eq);
        return result;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(CustomertransferFrom customertransferFrom){
        ValidatorUtil.validator(customertransferFrom);
        Result add = customertransferService.add(customertransferFrom);
        return add;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Integer id){
        ValidatorUtil.validator(id);
        Result delete = customertransferService.delete(id);
        return delete;
    }
}
