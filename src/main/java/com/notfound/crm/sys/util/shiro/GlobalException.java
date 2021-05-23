package com.notfound.crm.sys.util.shiro;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Wen
 * @Create 2021-05-18 16:16
 * @Description: shiro中通过全局异常处理，指定权限不足时的页面跳转
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(UnauthorizedException.class)
    @ResponseBody
    public String doException(Exception e){
        return "对不起，你没有权限！";
    }

}

//public class GlobalException implements HandlerExceptionResolver {
//
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        if (e instanceof UnauthorizedException) {
//            ModelAndView mv = new ModelAndView("/depart/list");
//            return mv;
//        }
//        return null;
//    }
//}