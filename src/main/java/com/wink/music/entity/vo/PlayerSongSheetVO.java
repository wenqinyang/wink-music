package com.wink.music.entity.vo;

import java.util.Date;

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
@Schema(title = "PlayerSongSheetVO", description = "渲染对象")
public class PlayerSongSheetVO implements Serializable {

    private static final long serialVersionUID = 393833373466698621L;

    /**
     * 播放器id
     */
    @Schema(title = "playerId", description = "播放器id")
    private Long playerId;

    /**
     * 歌单id
     */
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

