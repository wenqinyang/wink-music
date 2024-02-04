package com.wink.music.controller;

import com.wink.music.common.resepons.ResultBody;
import com.wink.music.entity.po.Role;
import com.wink.music.service.RoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 系统角色表(Role)表控制层
 *
 * @author wenqin
 * @since 2024-02-02 15:30:54
 */
@RestController
@RequestMapping("/role")
@Tag(name = "RoleController", description = "")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @Operation(summary = "通过主键查询系统角色表")
    public ResultBody selectOne(@PathVariable Serializable id) {
        return ResultBody.success(this.roleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param role 实体对象
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增系统角色表")
    public ResultBody insert(@RequestBody Role role) {
        return ResultBody.success(this.roleService.save(role));
    }

    /**
     * 修改数据
     *
     * @param role 实体对象
     * @return 修改结果
     */
    @PutMapping
    @Operation(summary = "修改系统角色表")
    public ResultBody update(@RequestBody Role role) {
        return ResultBody.success(this.roleService.updateById(role));
    }

    /**
     * 删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @DeleteMapping
    @Operation(summary = "删除系统角色表")
    public ResultBody delete(@RequestParam("idList") List<Long> idList) {
        return ResultBody.success(this.roleService.removeByIds(idList));
    }
}

