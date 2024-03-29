package com.wink.music.common.resepons;

import cn.hutool.core.collection.CollUtil;
import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/2/10 16:29
 **/
@Data
public class PageBean<T> implements Serializable {

    private static final long serialVersionUID = -9202109574544652243L;
    private long total;        //总记录数
    private List<T> list;    //结果集
    private int pageNum;    // 第几页
    private int pageSize;    // 每页记录数
    private int pages;        // 总页数
    private int size;        // 当前页的数量 <= pageSize，该属性来自ArrayList的size属性

    /**
     * 包装Page对象，因为直接返回Page对象，在JSON处理以及其他情况下会被当成List来处理，
     * 而出现一些问题。
     *
     * @param list page结果
     * @param
     */
    public PageBean(List<T> list) {
        LocalPage<?> localPage = LocalPageHelper.getLocalPage();
        if (null != localPage) {
            Page<?> page = localPage.getPage();
            if (page instanceof Page && CollUtil.isNotEmpty(list)) {
                this.pageNum = page.getPageNum();
                this.pageSize = page.getPageSize();
                this.total = page.getTotal();
                this.pages = page.getPages();
                this.list = list;
                this.size = page.size();
            }
        }
    }
}