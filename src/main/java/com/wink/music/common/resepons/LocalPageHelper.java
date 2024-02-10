package com.wink.music.common.resepons;

/**
 * This class is for 用来解决mapstruct转化时会丢弃pagehelper中的分页信息
 * 思路: 增加一个Mybatis拦截器，在PageHelper执行完分页查询之后，将Page对象保存在ThreadLocal中。
 * @author wen qin
 * @since 2024/2/10 17:41
 **/
public class LocalPageHelper {

    private static final ThreadLocal<LocalPage<?>> LOCAL_PAGES = new ThreadLocal<>();

    public static void setLocalPage(LocalPage<?> page) {
        LOCAL_PAGES.set(page);
    }

    public static LocalPage<?> getLocalPage() {
        return LOCAL_PAGES.get();
    }

    public static void clearLocalPage() {
        LOCAL_PAGES.remove();
    }
}
