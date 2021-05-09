package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.sys.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author Zheng_xiaolong
 * @Date 2021.05.09 17.15
 * @Description 部门(department)的web层
 */
@Controller
@RequestMapping("/depart")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/list")
    @ResponseBody
    public Result first(HttpServletRequest req, HttpServletResponse resp){
        Query query = new Query();
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        query.setCurrentPage(Integer.valueOf(currentPage));
        query.setPageSize(Integer.valueOf(pageSize));
        Result list = departmentService.queryPage(query);
        return list;
    }

    @RequestMapping("/queryPage")
    @ResponseBody
    public Result queryPage(HttpServletRequest req, HttpServletResponse resp){
        Query query = new Query();
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        query.setCurrentPage(Integer.valueOf(currentPage));
        query.setPageSize(Integer.valueOf(pageSize));
        Result list = departmentService.queryPage(query);
        return list;
    }


}
