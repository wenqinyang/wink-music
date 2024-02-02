package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户-角色关系表表(UserRole)表实体类
 *
 * @author wenqin
 * @since 2024-02-02 15:32:29
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "UserRole", description = "用户-角色关系表表")
@TableName("user_role")
public class UserRole extends BaseEntity implements Serializable {

    /**
     * 角色id，数据来源于role表的主键
     */
    @Schema(title = "name", description = "角色id，数据来源于role表的主键")
    private Long roleId;

    /**
     * 用户id，数据来源于user表的主键
     */
    @Schema(title = "userId", description = "用户id，数据来源于user表的主键")
    private Long userId;


}

