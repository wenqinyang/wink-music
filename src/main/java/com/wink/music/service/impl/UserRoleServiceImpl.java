package com.wink.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.mapper.UserRoleMapper;
import com.wink.music.entity.po.UserRole;
import com.wink.music.service.UserRoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 用户-角色关系表表(UserRole)表服务实现类
 *
 * @author wenqin
 * @since 2024-02-02 15:32:29
 */
@Service("userRoleService")
@AllArgsConstructor
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}

