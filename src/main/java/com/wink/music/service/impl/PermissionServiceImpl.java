package com.wink.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.mapper.PermissionMapper;
import com.wink.music.entity.po.Permission;
import com.wink.music.service.PermissionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 系统权限表(Permission)表服务实现类
 *
 * @author wenqin
 * @since 2024-02-02 16:49:51
 */
@Service("permissionService")
@AllArgsConstructor
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}

