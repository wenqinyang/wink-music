package com.wink.music;

import com.alibaba.fastjson2.JSON;
import com.wink.music.entity.po.User;
import com.wink.music.external.impl.NetEaseCloudMusic;
import com.wink.music.service.UserService;
import com.wink.music.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@SpringBootTest
@ActiveProfiles("dev")
class WinkMusicApplicationTests {
    @Resource
    private UserServiceImpl userService;
    @Resource
    private NetEaseCloudMusic netEaseCloudMusic;

    @Test
    void checkMusicStatus() {
        netEaseCloudMusic.checkMusicStatus();
    }
    @Test
    void saveUser() {
        User user = new User();
        user.setUsername("yang");
        user.setPassword("wen");
        userService.save(user);
    }
    @Test
    void getUserList() {
        List<User> list = userService.list();
        log.info(JSON.toJSONString(list));
    }

}
