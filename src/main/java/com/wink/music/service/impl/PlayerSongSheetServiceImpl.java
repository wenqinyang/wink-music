package com.wink.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.entity.po.PlayerSongSheet;
import com.wink.music.mapper.PlayerSongSheetMapper;
import com.wink.music.service.PlayerSongSheetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * (PlayerSongSheet)表服务实现类
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
@Service("playerSongSheetService")
@AllArgsConstructor
public class PlayerSongSheetServiceImpl extends ServiceImpl<PlayerSongSheetMapper, PlayerSongSheet> implements PlayerSongSheetService {

}

