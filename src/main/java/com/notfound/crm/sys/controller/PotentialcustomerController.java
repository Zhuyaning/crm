package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.CustomertraceVOOnly;
import com.notfound.crm.common.base.PageInfo;
import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.domain.Employee;
import com.notfound.crm.sys.form.PotentialcustomerForm;
import com.notfound.crm.sys.service.IDictionaryContentsService;
import com.notfound.crm.sys.service.IDictionaryDetailsService;
import com.notfound.crm.sys.service.IEmployeeService;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.sys.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

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
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IDictionaryContentsService  dictionaryContentsService;
    @Autowired
    private IDictionaryDetailsService dictionaryDetailsService;

    /***
     * 根据关键字查询客户信息，实现分页。
     * @param query
     * @return
     */
    @RequestMapping("/queryPage")
    public Result queryPage(ExtendsQuery query){
        Result result = iPotentialcustomerService.queryPage(query);
        return result;
    }

    /***
     * 增加一个客户信息
     * @param form
     * @return
     */
    @RequestMapping("/add")
    public Result add(PotentialcustomerForm form, HttpSession session){
        ValidatorUtil.validator(form);//验证前端传入数据非空
        EmployeeVO curr_user =(EmployeeVO) session.getAttribute("CURR_USER");
        System.out.println(curr_user);
        form.setSeller(curr_user.getName());
        form.setInputuser(curr_user.getName());
        form.setInputtime(new Date());
        form.setStatus(0);
        System.out.println(form);
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

    /***
     * 单个客户的id查询
     * @param id
     * @return
     */
    @RequestMapping("/queryOne")
    public Result queryOne(Integer id){
        Result result = iPotentialcustomerService.query(id);
        return result;
    }

    @RequestMapping("/tranceOne")
    public Result tranceOne(Integer id){
        System.out.println("############"+id);
        //先拿到客户名字
        Result eQuery = iEmployeeService.query(id);
        System.out.println(eQuery);
        EmployeeVO employeeVO = (EmployeeVO)eQuery.getData();
        String name = employeeVO.getName();//客户名字

        //查询到所有跟踪方式
        Query query = new Query();
        query.setKeyword("1106");
        Result result = dictionaryDetailsService.queryPage(query);
        PageInfo data3 = (PageInfo) result.getData();
        List<Object> dataList = data3.getData();//跟踪方式的list

        //封装上述两个数据的对象
        CustomertraceVOOnly customertraceVOOnly = new CustomertraceVOOnly();
        customertraceVOOnly.setName(name);
        customertraceVOOnly.setInfo(dataList);

        //再将数据封装到统一返回结果对象中
        Result resultFinal = new Result();
        resultFinal.setData(customertraceVOOnly);

        return resultFinal;
    }


    /***
     * 客户新增的报表信息，
     * @param query
     * @return 返回  {员工名：新增客户数量} list
     */
    @RequestMapping("/report")
    public Result queryPageReport(ExtendsQuery query){
        ValidatorUtil.validator(query);
        Result result = iPotentialcustomerService.queryPageReport(query);
        return result;
    }
}
