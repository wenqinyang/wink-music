package com.wink.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wink.music.entity.po.Role;

/**
 * 系统角色表(Role)表数据库访问层
 *
 * @author wenqin
 * @since 2024-02-02 15:31:30
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}

