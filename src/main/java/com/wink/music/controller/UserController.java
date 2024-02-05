package com.wink.music.controller;


import com.wink.music.common.resepons.ResultBody;
import com.wink.music.common.resepons.ResultCodeEnum;
import com.wink.music.entity.form.UserLoginForm;
import com.wink.music.entity.po.User;
import com.wink.music.entity.vo.UserVO;
import com.wink.music.service.UserService;
import com.wink.music.utils.JwtUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.wink.music.common.resepons.ResultBody.success;

/**
 * (User)表控制层
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
@RestController
@RequestMapping("/user")
@Tag(name = "UserController", description = "")
public class UserController {

    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public ResultBody login(@RequestBody @Validated UserLoginForm userLoginForm, HttpServletResponse response) {
        UserVO user = userService.checkUserLogin(userLoginForm);
        if (ObjectUtils.isEmpty(user)) {
            return ResultBody.error(ResultCodeEnum.LOGIN_ERROR.getCode(), ResultCodeEnum.LOGIN_ERROR.getMessage());
        }
        String token = JwtUtil.generateToken(user.getUsername());
        response.setHeader(JwtUtil.HEADER, token);
        response.setHeader("Access-control-Expost-Headers", JwtUtil.HEADER);
        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        return ResultBody.success(map);
    }

    @RequiresAuthentication
    @GetMapping("/logout")
    public ResultBody logout() {
        // 退出登录
        SecurityUtils.getSubject().logout();
        return ResultBody.success();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @Operation(summary = "通过主键查询")
    //@RequiresAuthentication
    public ResultBody selectOne(@PathVariable Serializable id) {
        return success(this.userService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
    @PostMapping
    @Operation(summary = "新增")
    public ResultBody insert(@RequestBody User user) {
        return success(this.userService.save(user));
    }

    /**
     * 修改数据
     *
     * @param user 实体对象
     * @return 修改结果
     */
    @PutMapping
    @Operation(summary = "修改")
    public ResultBody update(@RequestBody User user) {
        return success(this.userService.updateById(user));
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
        return success(this.userService.removeByIds(idList));
    }
}

