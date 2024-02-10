package com.wink.music.common.resepons;

import com.github.pagehelper.Page;
import lombok.Getter;

import java.io.Closeable;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/2/10 17:39
 **/
@Getter
public class LocalPage<T> implements Closeable {
    private final Page<T> page;

    public LocalPage(Page<T> page) {
        this.page = page;
    }

    public static <T> LocalPage<T> of(Page<T> page) {
        return new LocalPage<>(page);
    }

    @Override
    public void close() {
        LocalPageHelper.clearLocalPage();
    }
}

