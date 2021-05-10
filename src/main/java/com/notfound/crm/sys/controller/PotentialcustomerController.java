package com.notfound.crm.sys.controller;

import com.notfound.crm.common.base.Query;
import com.notfound.crm.common.base.Result;
import com.notfound.crm.sys.service.IPotentialcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *   Created by IntelliJ IDEA.
 *   User: ZhuYaning
 *   Date: 2021/5/10
 *   Time: 11:19
 */
@Controller
@RequestMapping("po")
public class PotentialcustomerController {

  @Autowired
  IPotentialcustomerService iPotentialcustomerService;

  @RequestMapping("/queryPage")
  public Result queryPage(Query query){

    Result result = iPotentialcustomerService.queryPage(query);

    return result;
  }
}
