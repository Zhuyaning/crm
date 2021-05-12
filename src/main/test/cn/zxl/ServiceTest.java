package cn.zxl;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.sys.service.ICustomertransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/12 10:22
 * @Version 1.0
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class ServiceTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private ICustomertransferService customertransferService;

    @Test
    public void test(){
        Query query = new Query();
        query.setKeyword("张");
//        query.setStartTime("2021-05-11");
//        Date date = new Date();
//        date.setTime(2021-05-06);

        Calendar cal = Calendar.getInstance();
        cal.set(2021,4,6);
        Calendar cal1 =Calendar.getInstance();
        cal1.set(2021,4,11);
        query.setStartTime(cal.getTime());
        query.setEndTime(cal1.getTime());
        Result result = customertransferService.queryPage(query);
        System.out.println(result);
    }
}
