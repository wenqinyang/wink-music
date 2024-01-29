package com.wink.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wink.music.entity.form.PlayerForm;
import com.wink.music.entity.po.Player;

/**
 * (Player)表服务接口
 *
 * @author wenqin
 * @since 2024-01-14 16:21:30
 */
public interface PlayerService extends IService<Player> {

    /**
     * 保存播放器
     */
    boolean save(PlayerForm playerForm);
}

