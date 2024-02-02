package com.wink.music.controller;

import com.wink.music.common.resepons.ResultBody;
import com.wink.music.entity.po.Permission;
import com.wink.music.service.PermissionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


/**
 * 系统权限表(Permission)表控制层
 *
 * @author makejava
 * @since 2024-02-02 15:11:21
 */
@RestController
@RequestMapping("permission")
@Tag(name = "PermissionController", description = "")
public class PermissionController {
    /**
     * 服务对象
     */
    @Resource
    private PermissionService permissionService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultBody queryById(@PathVariable("id") Long id) {
        return ResultBody.success(this.permissionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param permission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultBody add(Permission permission) {
        return ResultBody.success(this.permissionService.save(permission));
    }

    /**
     * 编辑数据
     *
     * @param permission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultBody edit(Permission permission) {
        return ResultBody.success(this.permissionService.updateById(permission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultBody deleteById(Long id) {
        return ResultBody.success(this.permissionService.removeById(id));
    }

}

