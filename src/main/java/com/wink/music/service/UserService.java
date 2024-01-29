package com.wink.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wink.music.entity.po.User;

/**
 * (User)表服务接口
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
public interface UserService extends IService<User> {

    /**
     * 检查用户状态
     */
    boolean checkUserStatus(Long userId);
}

