package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * (SongSheet)表实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "SongSheet", description = "")
@TableName("song_sheet")
public class SongSheet extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 312839643061653027L;

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

}

