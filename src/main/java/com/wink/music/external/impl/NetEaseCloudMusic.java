package com.wink.music.external.impl;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONPObject;
import com.alibaba.fastjson2.JSONPath;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wink.music.entity.po.Song;
import com.wink.music.external.MusicInterface;
import com.wink.music.service.SongService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * This class is for 网易云音乐
 *
 * @author wen qin
 * @since 2024/1/27 00:17
 **/
@Slf4j
@Service
public class NetEaseCloudMusic implements MusicInterface {
    @Resource
    private SongService songService;

    @Value("${music.analysis-addr}")
    private String analysisAddr;

    @Value("${music.api-path.check-music}")
    private String checkMusicPath;

    @Override
    public void checkMusicStatus() {
        String songSheetId = "dd22da3c4e9947e28924f9710a3c68d5";
        LambdaQueryWrapper<Song> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(StringUtils.isNoneBlank(songSheetId), Song::getSongSheetId, songSheetId);
        List<Song> songList = songService.list(wrapper);
        for (Song song: songList) {
            boolean musicStatus = getMusicStatus(song.getSongId());
            song.setStatus(musicStatus);
        }
        songService.updateBatchById(songList);
    }

    private boolean getMusicStatus(Long songId) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", songId);
        // 构建请求URL
        String requestPath = analysisAddr.concat(checkMusicPath);
        String result = HttpUtil.get(requestPath, paramMap);
        return (Boolean) JSONPath.eval(result, "$.success");
    }
}
