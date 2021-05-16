package com.notfound.crm.sys.controller;

import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.form.CustomertraceForm;
import com.notfound.crm.sys.service.ICustomertraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/12
 *   Time: 8:43
 */


@RequestMapping("/customertrace")
@RestController
public class CustomertraceController {

    @Autowired
    ICustomertraceService iCustomertraceService;

    /***
     * 添加一条跟踪记录。
     * @param form
     * @return
     */
    @RequestMapping("/add")
    public Result addCustomertrace(CustomertraceForm form){
        System.out.println("===============================");
        System.out.println(form);
        ValidatorUtil.validator(form);
        Result result = iCustomertraceService.add(form);
        return  result;
    }

    /***
     * 模糊查询记录以及分页查询
     * @param query
     * @return
     */
    @RequestMapping("/queryPage")
    public Result queryPageCustomertrace(ExtendsQuery query){
        ValidatorUtil.validator(query);
        Result result = iCustomertraceService.queryPage(query);
        return result;
    }

    /***
     * 查询一条数据
     * @param id
     * @return
     */
    @RequestMapping("/queryOne")
    public Result queryOneCustomertrace(Integer id){
        Result result = iCustomertraceService.query(id);
        return result;
    }

    /***
     * 修改一条客户跟踪记录
     * @param customertraceForm
     * @return
     */
    @RequestMapping("/update")
    public Result updateCustomertrace(CustomertraceForm customertraceForm){
        ValidatorUtil.validator(customertraceForm);
        Result result = iCustomertraceService.update(customertraceForm);
        return result;
    }

    /***
     * 删除一条客户追踪记录。
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public Result deleteCustomertrace(Integer id){
        Result result = new Result();
        if (id != null){
            result = iCustomertraceService.delete(id);
        }
        return result;
    }
}
