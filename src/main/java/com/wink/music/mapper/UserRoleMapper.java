package com.wink.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.wink.music.entity.po.UserRole;

/**
 * 用户-角色关系表表(UserRole)表数据库访问层
 *
 * @author wenqin
 * @since 2024-02-02 15:32:29
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}

