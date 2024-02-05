package com.wink.music.convert;

import com.wink.music.entity.po.User;
import com.wink.music.entity.vo.UserVO;
import org.mapstruct.Mapper;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/2/5 14:40
 **/

@Mapper(componentModel = "spring")
public interface UserConvert {
    UserVO toUserVO(User user);
}
