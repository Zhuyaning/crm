package com.notfound.crm.sys.controller;


import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.sys.domain.Department;
import com.notfound.crm.sys.form.DepartmentForm;
import com.notfound.crm.sys.service.IDepartmentService;
import com.notfound.crm.sys.vo.DepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



/**
 * @author Zheng_xiaolong
 * @Date 2021.05.09 17.15
 * @Description 部门(department)的web层
 */
@Controller
@RequestMapping("depart")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/list")
    @ResponseBody
    public Result first(Query query){
        Result list = departmentService.queryPage(query);
        return list;
    }



    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Long id){
        Result delete = departmentService.delete(id);
        return delete;
    }


}
