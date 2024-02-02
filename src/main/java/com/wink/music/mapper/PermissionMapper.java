package com.wink.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wink.music.entity.po.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统权限表(Permission)表数据库访问层
 *
 * @author wenqin
 * @since 2024-02-02 16:52:20
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

}

