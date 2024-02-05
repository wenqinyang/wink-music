package com.wink.music.config.shiro;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wink.music.common.resepons.ResultCodeEnum;
import com.wink.music.entity.po.User;
import com.wink.music.excetion.BizException;
import com.wink.music.service.RoleService;
import com.wink.music.service.UserRoleService;
import com.wink.music.service.UserService;
import com.wink.music.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AccountRealm extends AuthorizingRealm {


    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;
    @Resource
    private UserRoleService userRoleService;

    /**
     * 多重写一个support
     * 标识这个Realm是专门用来验证JwtToken
     * 不负责验证其他的token（UsernamePasswordToken）
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getCredentials();
        if (StringUtils.isBlank(token)) {
            throw new AuthenticationException("token cannot be empty.");
        }
        // 获取jwt中关于用户名
        String username = JwtUtil.getClaimsByToken(token).getSubject();
        // 查询用户
        User user = userService.getOne(new LambdaQueryWrapper<User>().eq(User::getUsername, username));
        if (user == null) {
            throw new BizException(ResultCodeEnum.NON_EXIST_USER.getCode(), "用户不存在");
        }
        if (!user.isStatus()) {
            throw new BizException(ResultCodeEnum.LOCKED_USER.getCode(), "用户被锁定");
        }

        Claims claims = JwtUtil.getClaimsByToken(token);
        if (JwtUtil.isTokenExpired(claims.getExpiration())) {
            throw new BizException(ResultCodeEnum.EXPIRE_TOKEN.getCode(), "token过期，请重新登录");
        }
        return new SimpleAuthenticationInfo(user, token, getName());
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        // 返回当前用户所拥有的角色、权限等信息，根据自身项目编码即可
//        String account = JwtUtil.getClaimsByToken(principalCollection.getPrimaryPrincipal());
//        // 查询用户角色
//        List<Role> roles = roleService.findByAccount(account);
//        for (int i = 0, roleLen = roles.size(); i < roleLen; i++) {
//            Role role = roles.get(i);
//            // 添加角色
//            simpleAuthorizationInfo.addRole(role.getName());
//            // 根据用户角色查询权限
//            List<Permission> permissions = permissionMapper.findByRoleId(role.getId());
//            for (int j = 0, perLen = permissions.size(); j < perLen; j++) {
//                Permission permission = permissions.get(j);
//                // 添加权限
//                simpleAuthorizationInfo.addStringPermission(permission.getSn());
//            }
//        }
//        return simpleAuthorizationInfo;


        log.info("s");
        return null;
    }
}

