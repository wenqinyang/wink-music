package com.wink.music.entity.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import lombok.Data;

/**
 * (SongSheet)VO实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "SongSheetDTO", description = "传输对象")
public class SongSheetDTO implements Serializable {

    private static final long serialVersionUID = -95150665675356118L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "id", description = "${column.comment}")
    private Long id;

    @Schema(title = "type", description = "${column.comment}")
    private String type;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "sheetId", description = "${column.comment}")
    private Long sheetId;

    /**
     * 歌单所属用户
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "userId", description = "歌单所属用户")
    private Long userId;

    /**
     * 歌单名称
     */
    @Schema(title = "name", description = "歌单名称")
    private String name;

    /**
     * 歌单作者
     */
    @Schema(title = "author", description = "歌单作者")
    private String author;

    /**
     * 记录创建时间
     */
    @Schema(title = "createTime", description = "记录创建时间")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @Schema(title = "updateTime", description = "记录更新时间")
    private Date updateTime;

    /**
     * 记录创建者
     */
    @Schema(title = "createBy", description = "记录创建者")
    private Long createBy;

    /**
     * 记录更新者
     */
    @Schema(title = "updateBy", description = "记录更新者")
    private Long updateBy;


}

