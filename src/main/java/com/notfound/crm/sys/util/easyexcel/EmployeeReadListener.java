package com.notfound.crm.sys.util.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.notfound.crm.sys.domain.Employee;
import com.notfound.crm.sys.vo.EmployeeVO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wan_JiaLin
 * @Create 2021-05-12 0:39
 * @Description: 员工类的回调监听器
 */
@Component
@Scope("prototype")   //此处必须换成多例模式
public class EmployeeReadListener extends AnalysisEventListener<EmployeeVO> {

    public static ArrayList<EmployeeVO> listData = new ArrayList<>();

    @Override
    public void invoke(EmployeeVO data, AnalysisContext context) {
        System.out.println("调用了Employee的表格导入:"+data);
        listData.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
