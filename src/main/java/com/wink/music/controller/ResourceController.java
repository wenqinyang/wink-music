package com.wink.music.controller;

import com.wink.music.common.resepons.ResultCodeEnum;
import com.wink.music.excetion.BizException;
import com.wink.music.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/1/27 23:59
 **/
@Slf4j
@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @Operation(summary = "通过id查询用户是否有权限获取到js文件")
    public String returnJs(@PathVariable("id") Long userId) throws IOException {
        boolean status = userService.checkUserStatus(userId);
        if (status) {
            Resource resource = new ClassPathResource("static/player/js/player.js");
            return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        }
        throw new BizException(ResultCodeEnum.INVALID_USER);
    }


    @GetMapping(value = "/css/player.css", produces = "text/css")
    public String returnCss() throws IOException {
        Resource resource = new ClassPathResource("static/player/css/player.css");
        return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    }

}
