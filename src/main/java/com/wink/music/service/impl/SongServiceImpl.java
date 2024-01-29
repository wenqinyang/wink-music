package com.wink.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.entity.po.Song;
import com.wink.music.mapper.SongMapper;
import com.wink.music.service.SongService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * (Song)表服务实现类
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
@Service("songService")
@AllArgsConstructor
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements SongService {

}

