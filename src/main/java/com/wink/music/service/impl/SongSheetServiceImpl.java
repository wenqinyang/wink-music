package com.wink.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.entity.po.SongSheet;
import com.wink.music.mapper.SongSheetMapper;
import com.wink.music.service.SongSheetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * (SongSheet)表服务实现类
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
@Service("songSheetService")
@AllArgsConstructor
public class SongSheetServiceImpl extends ServiceImpl<SongSheetMapper, SongSheet> implements SongSheetService {

}

