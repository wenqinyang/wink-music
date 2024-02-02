package com.wink.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.mapper.RoleMapper;
import com.wink.music.entity.po.Role;
import com.wink.music.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 系统角色表(Role)表服务实现类
 *
 * @author wenqin
 * @since 2024-02-02 15:31:31
 */
@Service("roleService")
@AllArgsConstructor
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}

