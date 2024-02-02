package com.wink.music.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wink.music.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (Player)表实体类
 *
 * @author wenqin
 * @since 2024-01-27 23:31:52
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Schema(title = "player", description = "")
@TableName("player")
public class Player extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -60028205064937887L;

    /**
     * 播放器名称
     */
    @Schema(title = "name", description = "播放器名称")
    private String name;

    /**
     * 关联用户id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Schema(title = "userId", description = "关联用户id")
    private Long userId;

    /**
     * 是否自动播放
     */
    @Schema(title = "autoPlayer", description = "是否自动播放")
    private boolean autoPlayer;

    /**
     * 是否随机播放
     */
    @Schema(title = "randomPlayer", description = "是否随机播放")
    private boolean randomPlayer;

    /**
     * 默认音量
     */
    @Schema(title = "defaultVolume", description = "默认音量")
    private Integer defaultVolume;

    /**
     * 是否显示歌词
     */
    @Schema(title = "showLrc", description = "是否显示歌词")
    private boolean showLrc;

    /**
     * 站点名称  用于播放器显示名称
     */
    @Schema(title = "siteName", description = "站点名称  用于播放器显示名称")
    private String siteName;

    /**
     * 欢迎语
     */
    @Schema(title = "greeting", description = "欢迎语")
    private String greeting;

    /**
     * 是否显示欢迎语
     */
    @Schema(title = "showGreeting", description = "是否显示欢迎语")
    private Integer showGreeting;

    /**
     * 默认专辑
     */
    @Schema(title = "defaultAlbum", description = "默认专辑")
    private Integer defaultAlbum;

    /**
     * 模糊背景是否开启
     */
    @Schema(title = "background", description = "模糊背景是否开启")
    private Integer background;

    /**
     * 播放器宽度
     */
    @Schema(title = "playerWidth", description = "播放器宽度")
    private Integer playerWidth;

    /**
     * 封面图宽度
     */
    @Schema(title = "coverWidth", description = "封面图宽度")
    private Integer coverWidth;

    /**
     * 显示音符：0不显示1显示
     */
    @Schema(title = "showNotes", description = "显示音符：0不显示1显示")
    private Integer showNotes;

    /**
     * 几秒后弹出音符：-1不弹出 >0秒后弹出
     */
    @Schema(title = "autoPopupPlayer", description = "几秒后弹出音符：-1不弹出 >0秒后弹出")
    private Integer autoPopupPlayer;


}

