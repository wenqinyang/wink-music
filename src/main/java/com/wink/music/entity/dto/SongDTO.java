package com.wink.music.entity.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import lombok.Data;

/**
 * (Song)VO实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@Schema(title = "SongDTO", description = "传输对象")
public class SongDTO implements Serializable {

    private static final long serialVersionUID = -67609547198350310L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "id", description = "${column.comment}")
    private Long id;

    /**
     * 歌曲id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "songId", description = "歌曲id")
    private Long songId;

    /**
     * 所属歌单
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "songSheetId", description = "所属歌单")
    private Long songSheetId;

    /**
     * 歌曲名称
     */
    @Schema(title = "name", description = "歌曲名称")
    private String name;

    /**
     * 歌曲类型
     */
    @Schema(title = "type", description = "歌曲类型")
    private String type;

    /**
     * 专辑名称
     */
    @Schema(title = "albumName", description = "专辑名称")
    private String albumName;

    /**
     * 歌手名称
     */
    @Schema(title = "artistName", description = "歌手名称")
    private String artistName;

    /**
     * 专辑图片
     */
    @Schema(title = "albumCover", description = "专辑图片")
    private String albumCover;

    /**
     * 歌曲地址
     */
    @Schema(title = "location", description = "歌曲地址")
    private String location;

    /**
     * 歌词地址
     */
    @Schema(title = "lyric", description = "歌词地址")
    private String lyric;

    /**
     * 排序
     */
    @Schema(title = "taxis", description = "排序")
    private Integer taxis;

    /**
     * 歌曲状态
     */
    @Schema(title = "status", description = "歌曲状态")
    private boolean status;

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

