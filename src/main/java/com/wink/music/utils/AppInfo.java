package com.wink.music.utils;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
public class AppInfo {
    public static void getAppInfo(ConfigurableApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();
        String protocol = "http";
        String sslKey = "server.ssl.key-store";
        if (environment.getProperty(sslKey) != null) {
            protocol = "https";
        }
        String applicationName = environment.getProperty("spring.application.name");
        String port = environment.getProperty("server.port");
        String contextPath = environment.getProperty("server.servlet.context-path");
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.error("ip 获取失败!", e.getMessage());
        }
        String[] activeProfile = environment.getActiveProfiles();
        String startTime = DateUtil.date(context.getStartupDate()).toString();

        log.info("\n------------------------------------------------------------------------------\n\t" +
                        "yaHu! application '{}' is running! place coding!\n\t" +
                        "StartTime: \t{}\n\t" +
                        "Local: \t\t{}://localhost:{}{}\n\t" +
                        "External: \t{}://{}:{}{}\n\t" +
                        "SwaggerAddress: {}://{}:{}{}/swagger-ui/index.html\n\t" +
                        "Profile(s): {}\n ------------------------------------------------------------------------------",
                applicationName, startTime, protocol, port, contextPath, protocol, ip, port, contextPath, protocol, ip, port, contextPath, activeProfile
        );
    }
}
