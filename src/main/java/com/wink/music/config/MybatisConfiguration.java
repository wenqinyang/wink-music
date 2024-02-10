package com.wink.music.config;

import com.github.pagehelper.PageInterceptor;
import com.github.pagehelper.autoconfigure.PageHelperProperties;
import com.wink.music.config.interceptor.LocalPageInterceptor;
import jakarta.annotation.PostConstruct;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/2/10 18:20
 **/
@Configuration
@EnableConfigurationProperties(PageHelperProperties.class)
public class MybatisConfiguration {

    private final List<SqlSessionFactory> sqlSessionFactoryList;

    private final PageHelperProperties properties;

    public MybatisConfiguration(List<SqlSessionFactory> sqlSessionFactoryList, PageHelperProperties properties) {
        this.sqlSessionFactoryList = sqlSessionFactoryList;
        this.properties = properties;
    }

    @PostConstruct
    public void addMyInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        pageInterceptor.setProperties(this.properties);
        LocalPageInterceptor localPageInterceptor = new LocalPageInterceptor();
        for (SqlSessionFactory sqlSessionFactory : sqlSessionFactoryList) {
            // 后加入的插件先执行，这里需要先执行我们自定义的LocalPage插件，之后执行分页插件才能拿到Page对象
            sqlSessionFactory.getConfiguration().addInterceptor(pageInterceptor);
            sqlSessionFactory.getConfiguration().addInterceptor(localPageInterceptor);
        }
    }
}

