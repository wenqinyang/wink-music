package com.wink.music.entity.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import lombok.Data;

/**
 * (PlayerSongSheet)VO实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "PlayerSongSheetDTO", description = "传输对象")
public class PlayerSongSheetDTO implements Serializable {

    private static final long serialVersionUID = 405458361138888707L;

    /**
     * 播放器id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "playerId", description = "播放器id")
    private Long playerId;

    /**
     * 歌单id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "songSheetId", description = "歌单id")
    private Long songSheetId;

    /**
     * 排序
     */
    @Schema(title = "taxis", description = "排序")
    private Integer taxis;

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

