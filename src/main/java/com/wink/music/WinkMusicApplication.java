package com.wink.music;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import com.wink.music.utils.AppInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.wink.music.mapper")
@SpringBootApplication(exclude = PageHelperAutoConfiguration.class)
public class WinkMusicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WinkMusicApplication.class, args);
        AppInfo.getAppInfo(context);
    }

}
