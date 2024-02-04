package com.wink.music.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wink.music.common.resepons.ResultBody;
import com.wink.music.entity.po.PlayerSongSheet;
import com.wink.music.service.PlayerSongSheetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

import java.io.Serializable;
import java.util.List;

import static com.wink.music.common.resepons.ResultBody.success;

/**
 * (PlayerSongSheet)表控制层
 *
 * @author wenqin
 * @since 2024-01-14 16:21:30
 */
@RestController
@RequestMapping("/playerSongSheet")
@Tag(name = "PlayerSongSheetController", description = "")
public class PlayerSongSheetController {
    /**
     * 服务对象
     */
    @Resource
    private PlayerSongSheetService playerSongSheetService;

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param playerSongSheet 查询实体
     * @return 所有数据
     */
    @GetMapping
    @Operation(summary = "分页查询")
    public ResultBody selectAll(Page<PlayerSongSheet> page, PlayerSongSheet playerSongSheet) {
        return success(this.playerSongSheetService.page(page, new QueryWrapper<>(playerSongSheet)));
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
        return success(this.playerSongSheetService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param playerSongSheet 实体对象
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增")
    public ResultBody insert(@RequestBody PlayerSongSheet playerSongSheet) {
        return success(this.playerSongSheetService.save(playerSongSheet));
    }

    /**
     * 修改数据
     *
     * @param playerSongSheet 实体对象
     * @return 修改结果
     */
    @PutMapping
    @Operation(summary = "修改")
    public ResultBody update(@RequestBody PlayerSongSheet playerSongSheet) {
        return success(this.playerSongSheetService.updateById(playerSongSheet));
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
        return success(this.playerSongSheetService.removeByIds(idList));
    }
}

