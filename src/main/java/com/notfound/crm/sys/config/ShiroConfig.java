package com.notfound.crm.sys.config;

import com.notfound.crm.sys.service.IPermissionsService;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wen
 * @Create 2021-05-16 15:28
 * @Description:
 */
@Configuration
public class ShiroConfig {

    @Autowired
    private IPermissionsService permissionsService;

    //Shiro的方言
//    @Bean
//    public ShiroDialect getShiroDialect(){
//        return new ShiroDialect();
//    }

    //自定义Realm
    @Bean
    public MyRealm getMyRealm(){
        MyRealm myRealm = new MyRealm();
        return myRealm;
    }

    //SecurityManager
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(MyRealm myRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myRealm);
        return securityManager;
    }

    //过滤器
    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean filter = new ShiroFilterFactoryBean();
        filter.setSecurityManager(securityManager);

        /**
         * 设置shiro的拦截规则
         * anon 匿名用户可访问
         * authc 认证用户可访问
         * user 使用RememberMe用户可访问
         * parms 对应权限可访问
         * role 对应角色可访问
         */
        Map<String,String> filterMap = new HashMap<>();
        // 静态资源允许访问
        //登录页允许访问
        filterMap.put("/sys","anon");
        filterMap.put("/sys/login","anon");
        filterMap.put("/sys/loginOut","anon");
        filterMap.put("/sys/getAuthCode.do","anon");

        filterMap.put("/sys/deleteByEmployeeId","perms[sys:delete]");
        filterMap.put("/customertrace/queryPage","perms[customertrace:queryPage]");

        //登录需验证访问
        filterMap.put("/**","authc");

        filter.setFilterChainDefinitionMap(filterMap);
        //登录路径
        filter.setLoginUrl("/sys/login");

        //设置未授权的访问的页面路径
        filter.setUnauthorizedUrl("/sys/login");
        return filter;
    }

}
