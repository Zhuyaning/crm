package com.notfound.crm.sys.config;

import com.notfound.crm.sys.mapper.EmployeeMapper;
import com.notfound.crm.sys.mapper.PermissionsMapper;
import com.notfound.crm.sys.mapper.RoleMapper;
import com.notfound.crm.sys.vo.EmployeeVO;
import lombok.SneakyThrows;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * @author Wen
 * @Create 2021-05-16 15:45
 * @Description: 创建一个类继承AuthorizingRealm类（实现Realm接口的类），重写方法
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionsMapper permissionsMapper;

    @Override
    public String getName(){
        return "myRealm";
    }

    /**
     * 获取授权信息,给授权器提供授权数据
     * @param principalCollection
     * @return
     */
    @SneakyThrows
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户的用户名
        String username = (String) principalCollection.iterator().next();
        //根据用户名查询当前用户的角色列表
        Set<String> roleName = roleMapper.queryRoleByUserName(username);
        //根据当前用户名查询当前角色的权限列表
        Set<String> permissions = permissionsMapper.queryPermissionsByUsername(username);

        //查到权限数据，返回
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roleName);
        //填充权限
        info.setStringPermissions(permissions);

        return info;
    }

    /**
     * 获取认证的安全数据（从数据库中查询的用户的正确数据）
     * @param authenticationToken
     * @return info
     * @throws AuthenticationException
     */
    @SneakyThrows
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //参数authenticationToken就是传递的subject.Login(token)
        //从token中获取用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        //根据用户名，从数据库中查询当前用户的安全数据
        EmployeeVO employeeVO = employeeMapper.queryEmployeeByName(username);

        AuthenticationInfo info = new SimpleAuthenticationInfo(
                username,       //当前用户用户名
                employeeVO.getPassword(),       //从当前的数据库中查询出来的安全密码
                getName());

        return info;
    }
}
