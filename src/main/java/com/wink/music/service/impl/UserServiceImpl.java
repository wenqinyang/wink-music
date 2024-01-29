package com.wink.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wink.music.entity.po.Song;
import com.wink.music.mapper.UserMapper;
import com.wink.music.entity.po.User;
import com.wink.music.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author wenqin
 * @since 2024-01-14 16:21:31
 */
@Service("userService")
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean checkUserStatus(Long userId) {
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(User::getId, userId);
        wrapper.eq(User::isStatus, true);
        return !ObjectUtils.isEmpty(this.getOne(wrapper));
    }
}

