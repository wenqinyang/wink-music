package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 系统权限表(Permission)实体类
 *
 * @author makejava
 * @since 2024-02-02 15:11:22
 */


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Schema(title = "permission", description = "")
@TableName("permission")
public class Permission extends BaseEntity implements Serializable {
    /**
     * 名称
     */
    private String name;
    /**
     * 接口路径
     */
    private String url;
    /**
     * 请求方式（0-get；1-post）
     */
    private Boolean method;
    /**
     * 服务名
     */
    private String service;
    /**
     * 父级权限id
     */
    private Integer parentId;
}

