package com.wink.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wink.music.entity.po.RolePermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色-权限关联表(RolePermission)表数据库访问层
 *
 * @author wenqin
 * @since 2024-02-02 16:53:10
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<RolePermission> {

}

