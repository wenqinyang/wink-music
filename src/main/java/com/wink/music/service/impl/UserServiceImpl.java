package com.wink.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.convert.UserConvert;
import com.wink.music.entity.form.UserLoginForm;
import com.wink.music.entity.po.Permission;
import com.wink.music.entity.po.RolePermission;
import com.wink.music.entity.po.User;
import com.wink.music.entity.po.UserRole;
import com.wink.music.entity.vo.UserVO;
import com.wink.music.mapper.UserMapper;
import com.wink.music.service.PermissionService;
import com.wink.music.service.RolePermissionService;
import com.wink.music.service.UserRoleService;
import com.wink.music.service.UserService;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
@Service("userService")
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserRoleService userRoleService;
    @Resource
    private RolePermissionService rolePermissionService;
    @Resource
    private PermissionService permissionService;

    @Resource
    private UserConvert userConvert;

    @Override
    public List<Permission> getPermissionByUsername(String username) {
        List<Permission> permissions = new ArrayList<>();
        User user = super.getOne(Wrappers.<User>lambdaQuery().eq(User::getUsername, username), true);
        if (null != user) {
            List<UserRole> userRoles = userRoleService.list(Wrappers.<UserRole>lambdaQuery().eq(UserRole::getUserId, user.getId()));
            if (CollectionUtils.isNotEmpty(userRoles)) {
                List<Long> roleIds = new ArrayList<>();
                userRoles.forEach(userRole -> roleIds.add(userRole.getRoleId()));
                List<RolePermission> rolePermissions = rolePermissionService.list(Wrappers.<RolePermission>lambdaQuery().in(RolePermission::getRoleId, roleIds));
                if (CollectionUtils.isNotEmpty(rolePermissions)) {
                    List<Long> permissionIds = new ArrayList<>();
                    rolePermissions.forEach(rolePermission -> permissionIds.add(rolePermission.getPermissionId()));
                    permissions = permissionService.list(Wrappers.<Permission>lambdaQuery().in(Permission::getId, permissionIds));
                }
            }
        }
        return permissions;
    }

    @Override
    public UserVO checkUserLogin(UserLoginForm userLoginForm) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, userLoginForm.getUsername());
        queryWrapper.eq(User::getPassword, userLoginForm.getPassword());
        return userConvert.toUserVO(this.getOne(queryWrapper));
    }

    @Override
    public boolean checkUserStatus(Long userId) {
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(User::getId, userId);
        wrapper.eq(User::isStatus, true);
        return !ObjectUtils.isEmpty(this.getOne(wrapper));
    }
}

