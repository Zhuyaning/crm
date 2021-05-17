package com.notfound.crm.sys.controller;

import com.notfound.crm.sys.domain.Employee;
import com.notfound.crm.sys.domain.Potentialcustomer;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.form.CustomertraceForm;
import com.notfound.crm.sys.service.ICustomertraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/12
 *   Time: 8:43
 */


@RequestMapping("/customertrace")
@RestController
public class CustomertraceController {


    ICustomertraceService iCustomertraceService;

    IPotentialcustomerService iPotentialcustomerService;

    public ICustomertraceService getiCustomertraceService() {
        return iCustomertraceService;
    }
    @Autowired
    public void setiCustomertraceService(ICustomertraceService iCustomertraceService) {
        this.iCustomertraceService = iCustomertraceService;
    }

    public IPotentialcustomerService getiPotentialcustomerService() {
        return iPotentialcustomerService;
    }
    @Autowired
    public void setiPotentialcustomerService(IPotentialcustomerService iPotentialcustomerService) {
        this.iPotentialcustomerService = iPotentialcustomerService;
    }

    /***
     * 添加一条跟踪记录。
     * @param form
     * @return
     */
    @RequestMapping("/add")
    public Result addCustomertrace(CustomertraceForm form,HttpSession session,Integer c_id){

        ValidatorUtil.validator(form);
        //操作客户
        Result  crr_customerResult = iPotentialcustomerService.query(c_id);
        Potentialcustomer customer = (Potentialcustomer) crr_customerResult.getData();
        System.out.println(customer);
        //操作时间
        form.setTraceitime(new Date());
        //操作员工,从Session中直接取，在session中为EmployeeVO类型，强制转型成Employee
        Employee curr_user = (Employee) session.getAttribute("CURR_USER");

        form.setInputuser(curr_user);//封装用户对象
        form.setCustomerid(customer);//封装客户对象

        Result result = iCustomertraceService.add(form);//插入数据
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
