package com.wink.music.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/1/27 00:32
 **/
@Data
public class BaseEntity {

    @TableId(type = IdType.ASSIGN_ID)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "id", description = "主键id")
    private String id;

    /**
     * 记录创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    @Schema(title = "createTime", description = "记录创建时间")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @Schema(title = "updateTime", description = "记录更新时间")
    private Date updateTime;

    /**
     * 记录创建者
     */
    @Schema(title = "createBy", description = "记录创建者")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long createBy;

    /**
     * 记录更新者
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "updateBy", description = "记录更新者")
    private Long updateBy;
}
