package com.wink.music.controller;


import com.wink.music.common.resepons.ResultBody;
import com.wink.music.entity.po.RolePermission;
import com.wink.music.service.RolePermissionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 角色-权限关联表(RolePermission)表控制层
 *
 * @author wenqin
 * @since 2024-02-02 15:31:58
 */
@RestController
@RequestMapping("/RolePermissions")
@Tag(name = "RolePermissionController", description = "")
public class RolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private RolePermissionService rolePermissionService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @Operation(summary = "通过主键查询角色-权限关联表")
    public ResultBody selectOne(@PathVariable Serializable id) {
        return ResultBody.success(this.rolePermissionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param rolePermission 实体对象
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增角色-权限关联表")
    public ResultBody insert(@RequestBody RolePermission rolePermission) {
        return ResultBody.success(this.rolePermissionService.save(rolePermission));
    }

    /**
     * 修改数据
     *
     * @param rolePermission 实体对象
     * @return 修改结果
     */
    @PutMapping
    @Operation(summary = "修改角色-权限关联表")
    public ResultBody update(@RequestBody RolePermission rolePermission) {
        return ResultBody.success(this.rolePermissionService.updateById(rolePermission));
    }

    /**
     * 删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @DeleteMapping
    @Operation(summary = "删除角色-权限关联表")
    public ResultBody delete(@RequestParam("idList") List<Long> idList) {
        return ResultBody.success(this.rolePermissionService.removeByIds(idList));
    }
}

