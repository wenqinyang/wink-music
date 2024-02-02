package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * (PlayerSongSheet)表实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "PlayerSongSheet", description = "")
@TableName("player_song_sheet")
public class PlayerSongSheet extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 530728640526071106L;

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


}

