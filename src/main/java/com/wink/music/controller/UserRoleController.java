package com.wink.music.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wink.music.common.resepons.ResultBody;
import com.wink.music.entity.po.UserRole;
import com.wink.music.service.UserRoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 用户-角色关系表表(UserRole)表控制层
 *
 * @author wenqin
 * @since 2024-02-02 15:32:29
 */
@RestController
@RequestMapping("/UserRoles")
@Tag(name = "RolePermissionController", description = "")
public class UserRoleController{
    /**
     * 服务对象
     */
    @Resource
    private UserRoleService userRoleService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param userRole 查询实体
     * @return 所有数据
     */
    @GetMapping
    @Operation(summary = "分页查询用户-角色关系表表")
    public ResultBody selectAll(Page<UserRole> page, UserRole userRole) {
        return ResultBody.success(this.userRoleService.page(page, new QueryWrapper<>(userRole)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @Operation(summary = "通过主键查询用户-角色关系表表")
    public ResultBody selectOne(@PathVariable Serializable id) {
        return ResultBody.success(this.userRoleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userRole 实体对象
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增用户-角色关系表表")
    public ResultBody insert(@RequestBody UserRole userRole) {
        return ResultBody.success(this.userRoleService.save(userRole));
    }

    /**
     * 修改数据
     *
     * @param userRole 实体对象
     * @return 修改结果
     */
    @PutMapping
    @Operation(summary = "修改用户-角色关系表表")
    public ResultBody update(@RequestBody UserRole userRole) {
        return ResultBody.success(this.userRoleService.updateById(userRole));
    }

    /**
     * 删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @DeleteMapping
    @Operation(summary = "删除用户-角色关系表表")
    public ResultBody delete(@RequestParam("idList") List<Long> idList) {
        return ResultBody.success(this.userRoleService.removeByIds(idList));
    }
}

