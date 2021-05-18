package com.notfound.crm.sys.util.shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Wen
 * @Create 2021-05-18 16:16
 * @Description: shiro中通过全局异常处理，指定权限不足时的页面跳转
 */
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler
    public String doException(Exception e, HttpServletResponse response){
        if(e instanceof AuthorizationException){
            try {
                response.sendRedirect("http://localhost:8888/depart/list");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}
