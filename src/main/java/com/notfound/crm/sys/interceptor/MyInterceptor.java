package com.notfound.crm.sys.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Wan_JiaLin
 * @Create 2021-05-08 19:24
 * @Description: 这里是员工类的拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        if(request.getSession().getAttribute("CURR_USER") == null){ //验证是否登录，如果为空，则用户未登录
//            return false;
//        }

        System.out.println("请求路径为："+request.getRequestURI());
        System.out.println("获取的cookies："+request.getCookies());
        System.out.println("SessionId的值为:"+request.getSession().getId());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
