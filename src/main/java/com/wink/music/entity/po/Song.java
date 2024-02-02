package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * (Song)表实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "Song", description = "")
@TableName("song")
public class Song extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 118237730391883468L;

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

}

