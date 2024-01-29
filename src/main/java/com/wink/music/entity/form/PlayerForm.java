package com.wink.music.entity.form;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/1/28 13:39
 **/
@Data
public class PlayerForm {
    /**
     * 播放器名称
     */
    @NotNull
    @Schema(title = "name", description = "播放器名称")
    private String name;
}
