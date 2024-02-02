package com.wink.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.mapper.RolePermissionMapper;
import com.wink.music.entity.po.RolePermission;
import com.wink.music.service.RolePermissionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 角色-权限关联表(RolePermission)表服务实现类
 *
 * @author wenqin
 * @since 2024-02-02 15:31:58
 */
@Service("rolePermissionService")
@AllArgsConstructor
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {

}

