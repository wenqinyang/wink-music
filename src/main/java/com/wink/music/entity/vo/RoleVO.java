package com.wink.music.entity.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统角色表(Role)VO实体类
 *
 * @author wenqin
 * @since 2024-02-02 15:31:31
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "RoleVO", description = "系统角色表渲染对象")
public class RoleVO implements Serializable {

    private static final long serialVersionUID = 515594687278304220L;

    @Schema(title = "id", description = "id")
    private Long id;

    /**
     * 名称
     */
    @Schema(title = "name", description = "名称")
    private String name;

    /**
     * 角色code
     */
    @Schema(title = "code", description = "角色code")
    private String code;

    /**
     * 备注
     */
    @Schema(title = "remark", description = "备注")
    private String remark;

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

