package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 系统角色表(Role)表实体类
 *
 * @author wenqin
 * @since 2024-02-02 15:31:31
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Schema(title = "Role", description = "系统角色表")
@TableName("role")
public class Role extends BaseEntity implements Serializable {

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


}

