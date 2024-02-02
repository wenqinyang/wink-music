package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 角色-权限关联表(RolePermission)表实体类
 *
 * @author wenqin
 * @since 2024-02-02 15:31:58
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Schema(title = "RolePermission", description = "角色-权限关联表")
@TableName("role_permission")
public class RolePermission extends BaseEntity implements Serializable {

    /**
     * 角色id
     */
    @Schema(title = "roleId", description = "角色id")
    private Long roleId;

    /**
     * 权限id
     */
    @Schema(title = "permissionId", description = "权限id")
    private Long permissionId;

}

