package com.wink.music.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wink.music.common.resepons.ResultBody;
import com.wink.music.entity.po.Song;
import com.wink.music.service.SongService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

import java.io.Serializable;
import java.util.List;

import static com.wink.music.common.resepons.ResultBody.success;

/**
 * (Song)表控制层
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
@RestController
@RequestMapping("/songs")
@Tag(name = "SongController", description = "")
public class SongController {
    /**
     * 服务对象
     */
    @Resource
    private SongService songService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param song 查询实体
     * @return 所有数据
     */
    @GetMapping
    @Operation(summary = "分页查询")
    public ResultBody selectAll(Page<Song> page, Song song) {
        return success(this.songService.page(page, new QueryWrapper<>(song)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @Operation(summary = "通过主键查询")
    public ResultBody selectOne(@PathVariable Serializable id) {
        return success(this.songService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param song 实体对象
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增")
    public ResultBody insert(@RequestBody Song song) {
        return success(this.songService.save(song));
    }

    /**
     * 修改数据
     *
     * @param song 实体对象
     * @return 修改结果
     */
    @PutMapping
    @Operation(summary = "修改")
    public ResultBody update(@RequestBody Song song) {
        return success(this.songService.updateById(song));
    }

    /**
     * 删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @DeleteMapping
    @Operation(summary = "删除")
    public ResultBody delete(@RequestParam("idList") List<Long> idList) {
        return success(this.songService.removeByIds(idList));
    }
}

