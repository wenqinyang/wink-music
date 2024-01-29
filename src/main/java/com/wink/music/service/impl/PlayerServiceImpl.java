package com.wink.music.service.impl;

import cn.hutool.Hutool;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.entity.form.PlayerForm;
import com.wink.music.entity.po.Player;
import com.wink.music.mapper.PlayerMapper;
import com.wink.music.service.PlayerService;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * (Player)表服务实现类
 *
 * @author wenqin
 * @since 2024-01-14 16:21:30
 */
@Service("playerService")
@AllArgsConstructor
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements PlayerService {

    @Override
    public boolean save(PlayerForm playerForm) {
        // 构造用户id, 等登录做完就行
        long id = IdUtil.getSnowflake().nextId();
        Player player = new Player();
        player.setUserId(id).setName(playerForm.getName()).setCreateBy(id);
        return this.save(player);
    }
}

