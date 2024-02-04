package com.wink.music.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wink.music.common.resepons.ResultBody;
import com.wink.music.entity.form.PlayerForm;
import com.wink.music.entity.po.Player;
import com.wink.music.service.PlayerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

import static com.wink.music.common.resepons.ResultBody.success;

/**
 * (Player)表控制层
 *
 * @author wenqin
 * @since 2024-01-14 16:21:30
 */
@RestController
@RequestMapping("/player")
@Tag(name = "PlayerController", description = "")
public class PlayerController {

    @Resource
    private PlayerService playerService;
    /**
     * 新增数据
     *
     * @param playerForm playerForm
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增")
    public ResultBody insert(@RequestBody @Valid PlayerForm playerForm) {
        return success(this.playerService.save(playerForm));
    }

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param player 查询实体
     * @return 所有数据
     */
    @GetMapping
    @Operation(summary = "分页查询")
    //@RequiresAuthentication
    public ResultBody selectAll(Page<Player> page, Player player) {
        return success(this.playerService.page(page, new QueryWrapper<>(player)));
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
        return success(this.playerService.getById(id));
    }

    /**
     * 修改数据
     *
     * @param player 实体对象
     * @return 修改结果
     */
    @PutMapping
    @Operation(summary = "修改")
    public ResultBody update(@RequestBody Player player) {
        return success(this.playerService.updateById(player));
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
        return success(this.playerService.removeByIds(idList));
    }
}

