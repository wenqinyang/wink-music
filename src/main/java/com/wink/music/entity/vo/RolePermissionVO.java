package com.wink.music.entity.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色-权限关联表(RolePermission)VO实体类
 *
 * @author wenqin
 * @since 2024-02-02 15:31:58
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "RolePermissionVO", description = "角色-权限关联表渲染对象")
public class RolePermissionVO implements Serializable {

    private static final long serialVersionUID = -39629110922256772L;

    @Schema(title = "id", description = "id")
    private Long id;

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

    /**
     * 创建人
     */
    @Schema(title = "createBy", description = "创建人")
    private Long createBy;

    /**
     * 记录创建时间
     */
    @Schema(title = "createTime", description = "记录创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @Schema(title = "updateBy", description = "更新人")
    private Long updateBy;

    /**
     * 记录更新时间
     */
    @Schema(title = "updateTime", description = "记录更新时间")
    private Date updateTime;


}

