package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/10
 *   Time: 11:19
 */
@RestController
@RequestMapping("customer")
public class PotentialcustomerController {

    @Autowired
    IPotentialcustomerService iPotentialcustomerService;

    /***
     * 根据关键字查询客户信息，实现分页。
     * @param query
     * @return
     */
    @RequestMapping("/queryPage")
    public Result queryPage(Query query){

        Result result = iPotentialcustomerService.queryPage(query);
        return result;
    }

    /***
     * 增加一个客户信息
     * @param form
     * @return
     */
    @RequestMapping("/add")
    public Result add(PotentialcustomerForm form){

        ValidatorUtil.validator(form);//验证前端传入数据非空
        Result result = iPotentialcustomerService.add(form);
        return result;
    }

    /***
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public Result deleteById(Integer id){
        Result result = iPotentialcustomerService.delete(id);
        return result;
    }

    /***
     * 修改客户对象
     * @param form
     * @return
     */
    @RequestMapping("/update")
    public Result update(PotentialcustomerForm form){
        ValidatorUtil.validator(form);
        Result result = iPotentialcustomerService.update(form);
        return result;
    }

}
