package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.common.validator.ValidatorUtil;
import com.notfound.crm.sys.domain.DictionaryContents;
import com.notfound.crm.sys.form.DictionaryContentsFrom;
import com.notfound.crm.sys.service.IDictionaryContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Zheng_xiaolong
 * @Date 2021/5/10 23:09
 * @Version 1.0
 * @Description 字典目录web层代码
 */
@Controller
@RequestMapping("/dicCon")
public class DictionaryContentsController {
    @Autowired
    private IDictionaryContentsService dictionaryContentsService;

    @RequestMapping("/list")
    @ResponseBody
    public Result list(Query query){
        Result list = dictionaryContentsService.queryPage(query);
        return list;
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(DictionaryContentsFrom dictionaryContentsFrom){
        ValidatorUtil.validator(dictionaryContentsFrom);//验证
        Result add = dictionaryContentsService.add(dictionaryContentsFrom);
        return add;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(DictionaryContentsFrom dictionaryContentsFrom){
        ValidatorUtil.validator(dictionaryContentsFrom);//验证
        Result update = dictionaryContentsService.update(dictionaryContentsFrom);
        return update;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Integer id){
        Result delete = dictionaryContentsService.delete(id);
        return delete;
    }
}
