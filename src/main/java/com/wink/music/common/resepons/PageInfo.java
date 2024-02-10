package com.wink.music.common.resepons;

import lombok.Data;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/2/10 17:00
 **/
@Data
public class PageInfo {

    /**
     * 页码
     */
    private int pageNum = 1;

    /**
     * 数量
     */
    private int pageSize = 10;
}
