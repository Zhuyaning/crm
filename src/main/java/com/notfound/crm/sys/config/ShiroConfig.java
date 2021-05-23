package com.notfound.crm.sys.config;

import com.notfound.crm.sys.util.shiro.GlobalException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.ThreadContext;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Wen
 * @Create 2021-05-16 15:28
 * @Description:
 */
@Configuration
public class ShiroConfig {

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

    //SessionManger
    @Bean
    public DefaultWebSessionManager getDefaultWebSessionManager(){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setGlobalSessionTimeout(15*1000);
        return sessionManager;
    }

    //SecurityManager
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(MyRealm myRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        ThreadContext.bind(securityManager);
        securityManager.setRealm(myRealm);
        securityManager.setSessionManager(getDefaultWebSessionManager());
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

//        filterMap.put("/permissions/queryPagePermissions","perms[permissions:queryPagePermissions]");
//        filterMap.put("/customertrace/queryPage","perms[customertrace:queryPage]");

        //登录需验证访问
        filterMap.put("/**","authc");
        //登录路径
        filter.setLoginUrl("/sys/login");
        //设置未授权的访问的页面路径
        filter.setUnauthorizedUrl("/sys/login");

        filter.setFilterChainDefinitionMap(filterMap);
        return filter;
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator autoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        autoProxyCreator.setProxyTargetClass(true);
        return autoProxyCreator;
    }

    // 加入注解的使用，不加入这个注解不生效
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }

    /**
     * 抛出UnauthorizedException的异常。
     * @return
     */
    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        //未授权的网页跳转至/depart/list
        properties.setProperty("org.apache.shiro.authz.UnauthorizedException", "/depart/list");
        resolver.setExceptionMappings(properties);
        return resolver;
    }

//    // 注册统一异常处理bean
//    @Bean
//    public GlobalException myExceptionResolver() {
//        return new GlobalException();
//    }

}
