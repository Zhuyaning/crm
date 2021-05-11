package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.form.DictionaryDetailsFrom;
import com.notfound.crm.sys.service.IDictionaryDetailsService;
import com.notfound.crm.sys.vo.DictionaryDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/10 23:21
 * @Version 1.0
 * @Description
 */
@Controller
@RequestMapping("/dicde")
public class DictionaryDetailsController {
    @Autowired
    private IDictionaryDetailsService dictionaryDetailsService;

    @RequestMapping("/list")
    @ResponseBody
    public Result list(Query query){
        Result list = dictionaryDetailsService.queryPage(query);
        return list;
    }

    @RequestMapping("/listTitle")
    @ResponseBody
    public List<DictionaryDetailsVO> listTitle(Query query){
        List<DictionaryDetailsVO> dictionaryDetailsVOS = dictionaryDetailsService.selectDicConTitle(query);
        return dictionaryDetailsVOS;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(DictionaryDetailsFrom dictionaryDetailsFrom){
        ValidatorUtil.validator(dictionaryDetailsFrom);//验证
        Result add = dictionaryDetailsService.add(dictionaryDetailsFrom);
        return add;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(DictionaryDetailsFrom dictionaryDetailsFrom){
        ValidatorUtil.validator(dictionaryDetailsFrom);//验证
        Result update = dictionaryDetailsService.update(dictionaryDetailsFrom);
        return update;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Integer id){
        Result delete = dictionaryDetailsService.delete(id);
        return delete;
    }
}
