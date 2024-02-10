package com.wink.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wink.music.common.resepons.PageBean;
import com.wink.music.common.resepons.PageInfo;
import com.wink.music.entity.form.PlayerForm;
import com.wink.music.entity.po.Player;
import com.wink.music.entity.vo.PlayerVO;

import java.util.List;

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

    /**
     * 分页查询
     */

    PageBean<PlayerVO> getPlayerListByPage(PageInfo pageInfo);
}

