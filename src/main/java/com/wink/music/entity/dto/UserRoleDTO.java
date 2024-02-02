package com.wink.music.entity.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户-角色关系表表(UserRole)VO实体类
 *
 * @author wenqin
 * @since 2024-02-02 15:32:30
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "UserRoleDTO", description = "用户-角色关系表表传输对象")
public class UserRoleDTO implements Serializable {

    private static final long serialVersionUID = 796837789907189859L;

    @Schema(title = "id", description = "id")
    private Long id;

    /**
     * 角色id，数据来源于role表的主键
     */
    @Schema(title = "id", description = "角色id，数据来源于role表的主键")
    private Long roleId;

    /**
     * 用户id，数据来源于user表的主键
     */
    @Schema(title = "id", description = "$用户id，数据来源于user表的主键")
    private Long userId;

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

