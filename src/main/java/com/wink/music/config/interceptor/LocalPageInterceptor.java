package com.wink.music.config.interceptor;


import com.github.pagehelper.Page;
import com.wink.music.common.resepons.LocalPage;
import com.wink.music.common.resepons.LocalPageHelper;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * This class is for LocalPage存入ThreadLocal
 *
 * @author wen qin
 * @since 2024/2/10 17:50
 **/



@Intercepts({
        @Signature(type = org.apache.ibatis.executor.Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
        @Signature(type = org.apache.ibatis.executor.Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
})
@Component
public class LocalPageInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        Object result = invocation.proceed();
        if (result instanceof Page page) {
            LocalPageHelper.setLocalPage(LocalPage.of(page));
        }
        return result;
    }

}

