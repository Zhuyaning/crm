import com.github.pagehelper.Page;
import com.notfound.crm.common.base.PageInfo;
import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.sys.mapper.PotentialcustomerMapper;
import com.notfound.crm.sys.service.ICustomertraceService;
import com.notfound.crm.sys.service.IDictionaryDetailsService;
import com.notfound.crm.sys.service.IEmployeeService;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import com.notfound.crm.sys.util.easyexcel.Md5Util;
import com.notfound.crm.sys.util.query.ExtendsQuery;
import com.notfound.crm.sys.vo.QueryPageReportVO;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/17
 *   Time: 1:34
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class TestAll {

    @Autowired
    private IDictionaryDetailsService dictionaryDetailsService;

    @Autowired
    IPotentialcustomerService iPotentialcustomerService;
    @Autowired
    PotentialcustomerMapper mapper;
    @Autowired
    ICustomertraceService iCustomertraceService;
    @Autowired
    IEmployeeService iEmployeeService;


    @Test
    public void test1() {
        Result result = iCustomertraceService.query(1);
        System.out.println(result);
    }

    @Test
    public void test2() {
        Result employees = iEmployeeService.queryPage(new Query());
        PageInfo data = (PageInfo) employees.getData();
        List<Page> objectList = (Page) data.getData();
        System.out.println(objectList);
    }

    @Test
    public void test3() {
        ExtendsQuery query = new ExtendsQuery();
        query.setGroupTypeStr("DATE_FORMAT(Potentialcustomer.inputTime,\'%Y-%m-%d\')");
        List<QueryPageReportVO> queryPageReportVOS = mapper.queryPageReport(query);
        System.out.println(queryPageReportVOS);
    }

    @Test
    public void test4() {
        ExtendsQuery query = new ExtendsQuery();
        query.setGroupTypeStr("employee.name");
        List<QueryPageReportVO> queryPageReportVOS = mapper.queryPageReport(query);
        System.out.println(queryPageReportVOS);
    }

    @Test
    public void test5() {
        String passWord = "123456";
        Md5Hash md5passWord = new Md5Hash(passWord.toString());
        System.out.println(md5passWord);
    }

    @Test
    public void Test() {
        ExtendsQuery eq = new ExtendsQuery();
        eq.setTitle("跟踪方式");
        Result result = dictionaryDetailsService.queryPage(eq);
        System.out.println(result);
    }

    @Test
    public void test6() {
        String md5String = Md5Util.getMd5String("123456");
        System.out.println(md5String);
    }
}
