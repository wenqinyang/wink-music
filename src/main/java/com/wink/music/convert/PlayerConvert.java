package com.wink.music.convert;

import com.wink.music.entity.po.Player;
import com.wink.music.entity.vo.PlayerVO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * This class is for
 *
 * @author wen qin
 * @since 2024/2/10 17:16
 **/
@Mapper(componentModel = "spring")
public interface PlayerConvert {
    PlayerVO toPlayerVO(Player player);

    List<PlayerVO> toPlayerVOList(List<Player> playerList);
}
