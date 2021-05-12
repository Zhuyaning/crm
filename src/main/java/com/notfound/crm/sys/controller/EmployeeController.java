package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.PageInfo;
import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.domain.Employee;
import com.notfound.crm.sys.form.EmployeeForm;
import com.notfound.crm.sys.service.IEmployeeService;
import com.notfound.crm.sys.util.easyexcel.EasyExcelUtil;
import com.notfound.crm.sys.util.easyexcel.EmployeeReadListener;
import com.notfound.crm.sys.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wan_JiaLin
 * @Create 2021-04-30 10:09
 * @Description: 这里是员工类的controller，端口访问
 */
@Controller
@RequestMapping("/sys")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeServiceImpl;

    @RequestMapping("/login")
    @ResponseBody
    //http://localhost:8888/sys/login
    public Result login(EmployeeForm employeeForm, String securityCode, HttpServletRequest request){

        Result result = employeeServiceImpl.login(employeeForm, securityCode, request);
        return result;
    }

    @RequestMapping("/loginOut")
    @ResponseBody
    //http://localhost:8888/sys/loginOut
    public Result loginOut(EmployeeForm employeeForm, HttpServletRequest request){
        request.setAttribute("CURR_USER",null);     //注销、退出登录清空Session

        return new Result();
    }

    @RequestMapping("/getAuthCode")
    @ResponseBody
    //http://localhost:8888/sys/getAuthCode
    public Result testInterceptor(EmployeeForm employeeForm){
        System.out.println("正在测试。。。。。");
        return new Result();
    }

    @RequestMapping("/queryPage")
    @ResponseBody
    //http://localhost:8888/sys/queryPage
    public Result queryPage(Query query){

        Result result = employeeServiceImpl.queryPage(query);
        return result;
    }

    @RequestMapping("/addEmployee")
    @ResponseBody
    //http://localhost:8888/sys/addEmployee
    public Result addEmployee(EmployeeForm employeeForm){
        ValidatorUtil.validator(employeeForm);  //验证前端传入的数据

        Result result = employeeServiceImpl.add(employeeForm);
        return result;
    }

    @RequestMapping("/deleteByEmployeeId")
    @ResponseBody
    //http://localhost:8888/sys/deleteByEmployeeId
    public Result deleteByEmployeeId(Integer id){

        Result result = employeeServiceImpl.delete(id);
        return result;
    }

    @RequestMapping("/deleteByEmployeeIdList")
    @ResponseBody
    //http://localhost:8888/sys/deleteByEmployeeIdList
    public Result deleteByEmployeeIdList(Integer[] ids){
        System.out.println(Arrays.toString(ids));
        Result result = employeeServiceImpl.deleteByIdList(ids);
        return result;
    }

    @RequestMapping("/updateEmployee")
    @ResponseBody
    //http://localhost:8888/sys/updateEmployee
    public Result updateEmployee(EmployeeVO employeeVO){
        System.out.println(employeeVO);
        ValidatorUtil.validator(employeeVO);
        Result result = employeeServiceImpl.updateByPrimaryKeySelective(employeeVO);
        return result;
    }

    @RequestMapping("/exportExcel.do")
    @ResponseBody
    //http://localhost:8888/sys/exportExcel.do
    public void exportExcel(HttpServletResponse response, Query query){

        Result result = employeeServiceImpl.queryPage(query);
        PageInfo data = (PageInfo) result.getData();
        List<Object> listdata = data.getData();

        EasyExcelUtil<EmployeeVO> excelUtil = new EasyExcelUtil<>();
        excelUtil.exportExcel(response, "员工表", EmployeeVO.class, listdata);

    }

    @RequestMapping("/importExcel.do")
    @ResponseBody
    //http://localhost:8888/sys/importExcel.do
    public Result importExcel(MultipartFile multipartFile){
        //新建easyexcel工具类，指定操作的实体类
        EasyExcelUtil<EmployeeVO> excelUtil = new EasyExcelUtil<>();

        Result result = excelUtil.importExcel(multipartFile, EmployeeVO.class, new EmployeeReadListener());

        return result;
    }


}
