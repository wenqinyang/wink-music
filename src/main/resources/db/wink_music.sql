/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80200 (8.2.0)
 Source Host           : 127.0.0.1:3306
 Source Schema         : wink_music

 Target Server Type    : MySQL
 Target Server Version : 80200 (8.2.0)
 File Encoding         : 65001

 Date: 29/01/2024 22:16:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for player
-- ----------------------------
DROP TABLE IF EXISTS `player`;
CREATE TABLE `player` (
  `id` bigint unsigned NOT NULL,
  `name` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '播放器名称',
  `user_id` bigint unsigned NOT NULL COMMENT '关联用户id',
  `auto_player` tinyint unsigned DEFAULT '0' COMMENT '是否自动播放',
  `random_player` tinyint unsigned DEFAULT '0' COMMENT '是否随机播放',
  `main_color` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT '168,155,148' COMMENT '主题颜色rgb',
  `default_volume` int DEFAULT '50' COMMENT '默认音量',
  `show_lrc` tinyint unsigned DEFAULT '0' COMMENT '是否显示歌词',
  `site_name` varchar(30) DEFAULT NULL COMMENT '站点名称  用于播放器显示名称',
  `greeting` varchar(30) DEFAULT NULL COMMENT '欢迎语',
  `show_greeting` tinyint(1) DEFAULT '0' COMMENT '是否显示欢迎语',
  `default_album` tinyint DEFAULT '0' COMMENT '默认专辑',
  `background` tinyint DEFAULT '0' COMMENT '模糊背景是否开启',
  `player_width` int DEFAULT '-1' COMMENT '播放器宽度',
  `cover_width` int DEFAULT '-1' COMMENT '封面图宽度',
  `show_notes` int DEFAULT '1' COMMENT '显示音符：0不显示1显示',
  `auto_popup_player` tinyint DEFAULT '-1' COMMENT '几秒后弹出音符：-1不弹出 >0秒后弹出',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `create_by` bigint unsigned NOT NULL COMMENT '记录创建者',
  `update_by` bigint unsigned DEFAULT NULL COMMENT '记录更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of player
-- ----------------------------
BEGIN;
INSERT INTO `player` (`id`, `name`, `user_id`, `auto_player`, `random_player`, `main_color`, `default_volume`, `show_lrc`, `site_name`, `greeting`, `show_greeting`, `default_album`, `background`, `player_width`, `cover_width`, `show_notes`, `auto_popup_player`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (12321, '123', 21, 0, 0, '168,155,148', 50, 0, NULL, NULL, 0, 0, 0, -1, -1, 1, -1, '2024-01-28 03:26:14', '2024-01-28 03:26:14', 3, 12);
INSERT INTO `player` (`id`, `name`, `user_id`, `auto_player`, `random_player`, `main_color`, `default_volume`, `show_lrc`, `site_name`, `greeting`, `show_greeting`, `default_album`, `background`, `player_width`, `cover_width`, `show_notes`, `auto_popup_player`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022819488557056, 'YCODE', 4022816221063168, 1, 1, NULL, 75, 1, '【YCODE】博客', '欢迎光临！', 1, 1, 1, -1, -1, 1, -1, '2024-01-14 06:55:57', '2024-01-27 15:14:31', 4022816221063168, 4022816221063168);
INSERT INTO `player` (`id`, `name`, `user_id`, `auto_player`, `random_player`, `main_color`, `default_volume`, `show_lrc`, `site_name`, `greeting`, `show_greeting`, `default_album`, `background`, `player_width`, `cover_width`, `show_notes`, `auto_popup_player`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (1751493447393083394, 'yangwenqin', 1751493447288225792, 0, 0, '168,155,148', 50, 0, NULL, NULL, 0, 0, 0, -1, -1, 1, -1, '2024-01-28 14:32:34', '2024-01-28 14:32:34', 1751493447288225792, NULL);
INSERT INTO `player` (`id`, `name`, `user_id`, `auto_player`, `random_player`, `main_color`, `default_volume`, `show_lrc`, `site_name`, `greeting`, `show_greeting`, `default_album`, `background`, `player_width`, `cover_width`, `show_notes`, `auto_popup_player`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (1751510742622416898, '史蒂夫', 1751510742525947904, 0, 0, '168,155,148', 50, 0, NULL, NULL, 0, 0, 0, -1, -1, 1, -1, '2024-01-28 15:41:17', '2024-01-28 07:41:52', 1751510742525947904, NULL);
COMMIT;

-- ----------------------------
-- Table structure for player_song_sheet
-- ----------------------------
DROP TABLE IF EXISTS `player_song_sheet`;
CREATE TABLE `player_song_sheet` (
  `player_id` bigint unsigned NOT NULL COMMENT '播放器id',
  `song_sheet_id` bigint unsigned NOT NULL COMMENT '歌单id',
  `taxis` int DEFAULT NULL COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `create_by` bigint unsigned NOT NULL COMMENT '记录创建者',
  `update_by` bigint unsigned DEFAULT NULL COMMENT '记录更新者',
  PRIMARY KEY (`player_id`,`song_sheet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of player_song_sheet
-- ----------------------------
BEGIN;
INSERT INTO `player_song_sheet` (`player_id`, `song_sheet_id`, `taxis`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022819488557056, 4022829796190208, 0, '2024-01-14 06:56:25', '2024-01-27 15:25:41', 4022819488557056, 4022819488557056);
COMMIT;

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `id` bigint unsigned NOT NULL,
  `song_id` bigint unsigned NOT NULL COMMENT '歌曲id',
  `song_sheet_id` bigint unsigned NOT NULL COMMENT '所属歌单',
  `name` varchar(100) DEFAULT NULL COMMENT '歌曲名称',
  `type` varchar(10) DEFAULT NULL COMMENT '歌曲类型',
  `album_name` varchar(100) DEFAULT NULL COMMENT '专辑名称',
  `artist_name` varchar(100) DEFAULT NULL COMMENT '歌手名称',
  `album_cover` varchar(100) DEFAULT NULL COMMENT '专辑图片',
  `location` varchar(150) DEFAULT NULL COMMENT '歌曲地址',
  `lyric` varchar(100) DEFAULT NULL COMMENT '歌词地址',
  `taxis` int DEFAULT NULL COMMENT '排序',
  `status` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '歌曲状态',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `create_by` bigint unsigned NOT NULL COMMENT '记录创建者',
  `update_by` bigint unsigned DEFAULT NULL COMMENT '记录更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of song
-- ----------------------------
BEGIN;
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294272, 16607998, 4022829796190208, 'The Show', 'wy', 'The Show', 'Lenka', 'https://p1.music.126.net/RbiJjFAmdPhzaqpM6nAczw==/109951164841022611.jpg?param=300x300', NULL, NULL, 45, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294273, 33916400, 4022829796190208, 'Magnet', 'wy', '最新热歌慢摇108', '96猫,vip店長', 'https://p1.music.126.net/TfFgMIfzrZaxVZelmG59dg==/3423879210123989.jpg?param=300x300', NULL, NULL, 43, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294274, 574566207, 4022829796190208, '盗将行', 'wy', '粥请客（二）', '花粥,马雨阳', 'https://p1.music.126.net/-qHPT3rhxDlu5zQV9NcQ-A==/109951163555860423.jpg?param=300x300', NULL, NULL, 20, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294275, 1375725396, 4022829796190208, 'Cyberangel', 'wy', '崩坏3-Onwards-Original Soundtrack', 'Hanser', 'https://p2.music.126.net/TAiliOjM10DlKiL56fPIMw==/109951163737497396.jpg?param=300x300', NULL, NULL, 3, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294276, 756338, 4022829796190208, 'to the beginning', 'wy', 'To the Beginning', 'Kalafina', 'https://p2.music.126.net/Dwt9iuzlUAX2NbAguQ5ajw==/109951163710267406.jpg?param=300x300', NULL, NULL, 1, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294277, 29534449, 4022829796190208, 'Unity', 'wy', 'Unity', 'TheFatRat', 'https://p1.music.126.net/GeKPZsDFaMEUx_pQK6PJyA==/6647647302424277.jpg?param=300x300', NULL, NULL, 67, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294278, 31352739, 4022829796190208, 'ずるいよ…', 'wy', 'NAMIDA CARATS', 'CHIHIRO', 'https://p2.music.126.net/9g91vBT2MMeH5HCkldLZLQ==/2909307767290550.jpg?param=300x300', NULL, NULL, 34, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294279, 571339907, 4022829796190208, '雪', 'wy', '雪', '杜雯媞', 'https://p1.music.126.net/wfXT9ZpyGiYNtYHzy3zsuA==/109951163353129069.jpg?param=300x300', NULL, NULL, 39, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294280, 31191531, 4022829796190208, 'Cherish you', 'wy', 'Cherish you', '矢作紗友里', 'https://p1.music.126.net/zQpcOrtpIwNM9RJ4NpRzlA==/2881819978979597.jpg?param=300x300', NULL, NULL, 65, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294281, 427610621, 4022829796190208, '樱花樱花想见你', 'wy', '霜蝶栖阴叶，青萝行幽枝', '花绕枝,柳亦小米', 'https://p2.music.126.net/TjNzzjR2V7gqaLpo9qtpEQ==/18161733068340181.jpg?param=300x300', NULL, NULL, 70, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294282, 1313354324, 4022829796190208, '出山', 'wy', '粥请客（四）', '花粥,王胜娚', 'https://p2.music.126.net/xUAfdMHdXhu3BmO4g8nOYA==/109951163573311341.jpg?param=300x300', NULL, NULL, 26, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294283, 30148963, 4022829796190208, 'ツギハギスタッカート', 'wy', 'ツギハギスタッカート', '初音ミク,とあ', 'https://p1.music.126.net/7PrXjTCPeeiPEVub6-knnA==/7754855510781270.jpg?param=300x300', NULL, NULL, 4, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294284, 4931780, 4022829796190208, 'Fragment~The heat haze of summer~', 'wy', 'CIRCUS 10th Collect', 'KAMIN', 'https://p2.music.126.net/BQXtasXr0RsXLO18wozQpw==/5935163767210690.jpg?param=300x300', NULL, NULL, 2, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294285, 34229976, 4022829796190208, 'Panama', 'wy', 'Panama', 'Matteo', 'https://p2.music.126.net/8dEEj_V5UxD2VW3tXxIp4w==/109951163676757259.jpg?param=300x300', NULL, NULL, 57, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294286, 26503707, 4022829796190208, '7년간의 사랑', 'wy', 'Fun Town 20', '金贤政', 'https://p1.music.126.net/iXtH_EPST-NmQAHqdH4mqA==/6644348766761626.jpg?param=300x300', NULL, NULL, 7, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294287, 1372796676, 4022829796190208, '那女孩对我说 (完整版)', 'wy', '那女孩对我说', 'Uu', 'https://p1.music.126.net/tXo6kGSy27gXlQzOI2O5BA==/109951164161042589.jpg?param=300x300', NULL, NULL, 18, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294288, 472361096, 4022829796190208, 'Despacito (Remix)', 'wy', 'Despacito (Remix)', 'Luis Fonsi,Daddy Yankee,Justin Bieber', 'https://p1.music.126.net/vA4UF75gS1Qpyx07B0acrw==/18521273371761277.jpg?param=300x300', NULL, NULL, 14, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294289, 459925524, 4022829796190208, 'フリージア', 'wy', 'フリージア ＜通常盤＞', 'Uru', 'https://p1.music.126.net/Oa-PaFEYGPv2c5B4mL43EA==/109951163697506315.jpg?param=300x300', NULL, NULL, 16, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294290, 28566210, 4022829796190208, 'Boom Clap', 'wy', 'The Fault In Our Stars (Music From the Motion Picture)', 'Charli XCX', 'https://p1.music.126.net/90VlOVM9DUe9HBVPvZ035g==/5936263278604377.jpg?param=300x300', NULL, NULL, 66, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294291, 458507422, 4022829796190208, '春待ちクローバー', 'wy', '春待ちクローバー', 'M・A・O', 'https://p1.music.126.net/C7_lX3H8rLnA3E3Vph2-Qg==/18578447976309782.jpg?param=300x300', NULL, NULL, 69, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294292, 1600454, 4022829796190208, 'Wild Wild Web', 'wy', 'It\'s Crazy', 'John The Whistler', 'https://p1.music.126.net/FQ1-Q_WcAVqrFf5GQSapbQ==/5837307232041041.jpg?param=300x300', NULL, NULL, 37, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294293, 22845457, 4022829796190208, '불꽃', 'wy', 'Koyote Vol.6', '高耀太', 'https://p1.music.126.net/y6yPnkXPB24RgHWRlWdjKA==/742170348772395.jpg?param=300x300', NULL, NULL, 6, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294294, 149791, 4022829796190208, '请安静的忘记我', 'wy', '一年一度的夏天', '孙子涵', 'https://p1.music.126.net/0xPorgtnYrFqVGPpgKWnfQ==/4410141139023229.jpg?param=300x300', NULL, NULL, 64, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294295, 30780496, 4022829796190208, 'Mine (Illenium Remix)', 'wy', 'Mine (Illenium Remix)', 'ILLENIUM,Phoebe Ryan', 'https://p1.music.126.net/94Zjhb6ibXN9jpIjRQDbUw==/7762552092459017.jpg?param=300x300', NULL, NULL, 15, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294296, 18098592, 4022829796190208, 'God Is a Girl', 'wy', 'God Is a Girl', 'Groove Coverage', 'https://p2.music.126.net/TtyuERnDSU_F05Y1ZnjaYg==/109951163531509784.jpg?param=300x300', NULL, NULL, 58, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294297, 27927368, 4022829796190208, '孟婆的碗', 'wy', '热门华语144', '魏佳艺', 'https://p1.music.126.net/pN3fyaf4AQeC555OQF6JQQ==/3284241233642908.jpg?param=300x300', NULL, NULL, 63, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294298, 1349292048, 4022829796190208, '心如止水', 'wy', '成语接龙', 'Ice Paper', 'https://p2.music.126.net/MLQl_7poLz2PTON6_JZZRQ==/109951163938219545.jpg?param=300x300', NULL, NULL, 29, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294299, 4083478, 4022829796190208, 'On the Radio', 'wy', '21st Century Digital Girl [Universal]', 'Groove Coverage', 'https://p1.music.126.net/N2yIMSJht1NMvA44ufYzJA==/109951163008410734.jpg?param=300x300', NULL, NULL, 47, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294300, 424262056, 4022829796190208, 'インドア系ならトラックメイカー', 'wy', 'インドア系ならトラックメイカー', 'Yunomi,nicamoq', 'https://p2.music.126.net/F8QUlvMbIa5DG0Gu6wop_g==/3416182637666433.jpg?param=300x300', NULL, NULL, 28, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294301, 812400, 4022829796190208, 'PLANET', 'wy', '3ラムジ', 'ラムジ', 'https://p1.music.126.net/cCyPSxi-BE2h-SmpLBztbA==/18635622580993683.jpg?param=300x300', NULL, NULL, 46, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294302, 345741, 4022829796190208, '触电 (完整版)', 'wy', '摇头舞曲 3', '芭比', 'https://p1.music.126.net/L4kHkkENw9PS2j0w6Q39Jw==/109951163903622260.jpg?param=300x300', NULL, NULL, 48, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294303, 407699625, 4022829796190208, 'Falling Away (Festival Mix (Radio Edit))', 'wy', 'Creation', 'Seven Lions,Lights', 'https://p1.music.126.net/9ms_puNiD6-rgOJd9vxeMQ==/1395280259217321.jpg?param=300x300', NULL, NULL, 50, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294304, 436487129, 4022829796190208, 'Move Your Body (Alan Walker Remix)', 'wy', 'This Is Acting (Deluxe Version)', 'Sia,Alan Walker', 'https://p2.music.126.net/9h_TA43qbHLTKwQrQzhLgQ==/18162832579997237.jpg?param=300x300', NULL, NULL, 30, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294305, 504017347, 4022829796190208, 'Something Just Like This (DJ Asher Remix Cover)', 'wy', 'Something Just Like This (DJ Asher Remix Cover)', 'DJ Asher,The Chainsmokers,Coldplay', 'https://p1.music.126.net/qJOiBo7F8sybUN6XU1f3og==/109951164208527342.jpg?param=300x300', NULL, NULL, 38, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294306, 1404885266, 4022829796190208, '下山', 'wy', '下山', '要不要买菜', 'https://p1.music.126.net/Aj4X1kpV-C2LLi-e_Xhgvg==/109951164499744148.jpg?param=300x300', NULL, NULL, 17, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294307, 34364402, 4022829796190208, '줄래', 'wy', '줄래', '殆死悲爱,Dream Girls', 'https://p2.music.126.net/-kbQM96WN5RaCDpe1yRVCQ==/3286440255987289.jpg?param=300x300', NULL, NULL, 35, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294308, 476513774, 4022829796190208, '琵琶行', 'wy', '高考必背曲目', '奇然,沈谧仁', 'https://p2.music.126.net/NQBaw13hHiaTh41QQUYsQg==/109951162922231753.jpg?param=300x300', NULL, NULL, 22, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294309, 494858477, 4022829796190208, 'Forever Friends', 'wy', '打上花火', 'DAOKO', 'https://p1.music.126.net/ZUCE_1Tl_hkbtamKmSNXEg==/109951163009282836.jpg?param=300x300', NULL, NULL, 52, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294310, 29732992, 4022829796190208, '光るなら', 'wy', '光るなら', 'Goose house', 'https://p1.music.126.net/TM6SM2-ppcd1F66YyjR-Eg==/2537672838610591.jpg?param=300x300', NULL, NULL, 9, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294311, 28593339, 4022829796190208, 'Sunshine Girl', 'wy', 'ICE CANDY', 'moumoon', 'https://p2.music.126.net/s16LOpG2vdbuPHOQ39xvrQ==/18591642115850247.jpg?param=300x300', NULL, NULL, 24, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294312, 16432052, 4022829796190208, 'Girlfriend', 'wy', 'Girlfriend', 'Avril Lavigne', 'https://p1.music.126.net/TH-AUs3orgfetNszPgBOEA==/109951163077008999.jpg?param=300x300', NULL, NULL, 42, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294313, 547971231, 4022829796190208, 'トリカゴ', 'wy', 'ダーリン・イン・ザ・フランキス エンディング集 vol.1', 'XX:me', 'https://p1.music.126.net/gWAve6Vnbv0vd6WKa3tGSA==/109951163173817656.jpg?param=300x300', NULL, NULL, 8, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294314, 1311347989, 4022829796190208, '我已经到了幻想尽头', 'wy', '我已经到了幻想尽头', '音阙诗听,昆玉', 'https://p1.music.126.net/7-9oWOcwjGUSfahEbaP0Qg==/109951163571661446.jpg?param=300x300', NULL, NULL, 19, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294315, 1357785909, 4022829796190208, '野狼disco', 'wy', '野狼disco', '宝石Gem', 'https://p2.music.126.net/USRrIEfSNxJ4JnfKp4f6pA==/109951164470147956.jpg?param=300x300', NULL, NULL, 23, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294316, 34169865, 4022829796190208, 'メイデー、メイビーネイビー', 'wy', 'ロストピリカ', 'そらこ', 'https://p1.music.126.net/d7Yf9tEH6WypL9kVjkwdqw==/7991250512748934.jpg?param=300x300', NULL, NULL, 12, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294317, 26418242, 4022829796190208, '귀요미송', 'wy', '귀요미송 (ReTitle)', 'Hari', 'https://p2.music.126.net/oaE0jWMQIaT706-6NWj2AQ==/17647161626238216.jpg?param=300x300', NULL, NULL, 53, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294318, 29713638, 4022829796190208, '心做し', 'wy', '最新热歌慢摇82', '花たん', 'https://p1.music.126.net/hvvqvDlfc1ffazb-wbT7XQ==/3286440257121624.jpg?param=300x300', NULL, NULL, 62, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294319, 35416430, 4022829796190208, 'circles!', 'wy', 'circles!', 'nekodex', 'https://p2.music.126.net/oTmabpH1isXRamg1RyzMhg==/3412884093248256.jpg?param=300x300', NULL, NULL, 55, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294320, 1325711137, 4022829796190208, 'Rightfully', 'wy', 'Rightfully', 'Mili', 'https://p2.music.126.net/TJnD3fw0apTcJmdsK5uFhQ==/109951163674868981.jpg?param=300x300', NULL, NULL, 36, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294321, 1345848098, 4022829796190208, '绿色', 'wy', '绿色', '陈雪凝', 'https://p1.music.126.net/R4ZP3AJ9xV0vvw8LX7AbMA==/109951163860425334.jpg?param=300x300', NULL, NULL, 13, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294322, 406096264, 4022829796190208, 'Theme of Ken', 'wy', 'Street Fighter V Original Soundtrack', '青木征洋', 'https://p1.music.126.net/r-wqIEVsXkVfyC6Sy-aJVg==/1397479281075067.jpg?param=300x300', NULL, NULL, 68, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294323, 36270426, 4022829796190208, '来自天堂的魔鬼', 'wy', '新的心跳', 'G.E.M.邓紫棋', 'https://p2.music.126.net/kVwk6b8Qdya8oDyGDcyAVA==/1364493930777368.jpg?param=300x300', NULL, NULL, 33, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294324, 515143305, 4022829796190208, '9420', 'wy', '9420', '麦小兜', 'https://p1.music.126.net/tyOXJ8U9TisNRfcorQ-4og==/109951163050074297.jpg?param=300x300', NULL, NULL, 49, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294325, 1330348068, 4022829796190208, '起风了', 'wy', '起风了', '买辣椒也用券', 'https://p1.music.126.net/diGAyEmpymX8G7JcnElncQ==/109951163699673355.jpg?param=300x300', NULL, NULL, 44, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294326, 27876986, 4022829796190208, 'tu vivi nell\'aria', 'wy', ' tu vivi nell´aria', 'Gigi D\'Agostino', 'https://p1.music.126.net/C8r_K7oXLejFGc9G654rcw==/1898856581276965.jpg?param=300x300', NULL, NULL, 41, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294327, 1369798757, 4022829796190208, '芒种', 'wy', '芒种', '音阙诗听,赵方婧', 'https://p2.music.126.net/7ZKMPIvPcwaK08ffDBTjJw==/109951164124664532.jpg?param=300x300', NULL, NULL, 27, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294328, 41654827, 4022829796190208, '[A]ddiction', 'wy', 'EVOLUTION', 'EVO+', 'https://p2.music.126.net/MqPASWNd9f60mic6scZ_EA==/109951163597238996.jpg?param=300x300', NULL, NULL, 54, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294329, 1313558186, 4022829796190208, '一曲相思 ', 'wy', '一曲相思', '半阳', 'https://p2.music.126.net/yHRY23bKbLJjjbSnE-T8gA==/109951163575213436.jpg?param=300x300', NULL, NULL, 21, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294330, 26092806, 4022829796190208, 'Take me hand', 'wy', 'WONDER Tourism', 'DAISHI DANCE,Cecile Corbel', 'https://p2.music.126.net/AoVFMKkLVMOmTMo_A6x02g==/109951163403515653.jpg?param=300x300', NULL, NULL, 59, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294331, 1392728703, 4022829796190208, '紅蓮華（Cover：LiSA）', 'wy', '紅蓮華', '多多poi', 'https://p1.music.126.net/YswNfVOGRjMrX3-bcykqUA==/109951164382127294.jpg?param=300x300', NULL, NULL, 10, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294332, 452986458, 4022829796190208, '红昭愿', 'wy', '红昭愿', '音阙诗听', 'https://p1.music.126.net/8ltR3o9R8uJ9_5Cc71cDhA==/109951162951242154.jpg?param=300x300', NULL, NULL, 51, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294333, 1217823, 4022829796190208, 'Be What You Wanna Be', 'wy', 'Darin', 'Darin', 'https://p1.music.126.net/aQUfPL62g65_1DNa4HzJ6Q==/109951163460311144.jpg?param=300x300', NULL, NULL, 40, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294334, 478684790, 4022829796190208, '爱河', 'wy', '爱河', '蒋雪儿', 'https://p1.music.126.net/BXLZAikpghN11prOrGMUfA==/109951162929079435.jpg?param=300x300', NULL, NULL, 5, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294335, 29307195, 4022829796190208, 'BRE@TH//LESS', 'wy', 'アルドノア・ゼロ オリジナル・サウンドトラック', '小林未郁', 'https://p2.music.126.net/pmCJkl8VMsksKPdmsFirfg==/6631154627463930.jpg?param=300x300', NULL, NULL, 31, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294336, 554244883, 4022829796190208, 'Mirror Mirror', 'wy', 'Millennium Mother', 'Mili', 'https://p2.music.126.net/ww7gcJ_erzPa8jgZesmTOA==/109951163271403502.jpg?param=300x300', NULL, NULL, 0, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294337, 29107447, 4022829796190208, 'ろりこんでよかった～', 'wy', 'だめぽじゃないですでんぱですっ!!', 'ちぃむdmp☆', 'https://p1.music.126.net/rB8Jb2K8sb3ycLJMQcT9Yg==/2534374302073281.jpg?param=300x300', NULL, NULL, 11, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294338, 29712183, 4022829796190208, 'Happy Halloween', 'wy', '最新热歌慢摇82', '柊優花,鎖那', 'https://p1.music.126.net/hvvqvDlfc1ffazb-wbT7XQ==/3286440257121624.jpg?param=300x300', NULL, NULL, 61, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294339, 327089, 4022829796190208, '画心', 'wy', '画心', '张靓颖', 'https://p2.music.126.net/V_Bghb8c6fWGtcyZmtf-UQ==/873012232454523.jpg?param=300x300', NULL, NULL, 32, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294340, 31445554, 4022829796190208, '七月上', 'wy', '阿敬的单曲集', 'Jam', 'https://p2.music.126.net/uxyYBS5jhmi_DN4xDYy3eg==/7872503255697381.jpg?param=300x300', NULL, NULL, 71, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294341, 509313159, 4022829796190208, '病名は愛だった (Cover 鏡音リン/鏡音レン)', 'wy', '最新热歌慢摇110', 'まふまふ', 'https://p2.music.126.net/p-7pKS_S86OJo8cHcDNKFw==/109951163922821064.jpg?param=300x300', NULL, NULL, 56, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294342, 2771069, 4022829796190208, 'I\'m Folle de Toi - In-Grid, Banks, C.', 'wy', 'Rendez-Vous: The Sound of the Mediterranean', 'In-Grid', 'https://p2.music.126.net/ZdSjOqHU6agWPATn5X83EA==/1752621534680124.jpg?param=300x300', NULL, NULL, 25, 0, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
INSERT INTO `song` (`id`, `song_id`, `song_sheet_id`, `name`, `type`, `album_name`, `artist_name`, `album_cover`, `location`, `lyric`, `taxis`, `status`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022832858294343, 22793308, 4022829796190208, 'Girls', 'wy', 'aMazing MusiQue PaRK', 'MARiA', 'https://p2.music.126.net/-u01fWXDqQb9k-sY6I2NNw==/943380976656900.jpg?param=300x300', NULL, NULL, 60, 1, '2024-01-14 06:56:40', '2024-01-27 15:06:08', 4022816221063168, 4022816221063168);
COMMIT;

-- ----------------------------
-- Table structure for song_sheet
-- ----------------------------
DROP TABLE IF EXISTS `song_sheet`;
CREATE TABLE `song_sheet` (
  `id` bigint unsigned NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `sheet_id` bigint unsigned DEFAULT NULL,
  `user_id` bigint unsigned DEFAULT NULL COMMENT '歌单所属用户',
  `name` varchar(30) DEFAULT NULL COMMENT '歌单名称',
  `author` varchar(30) DEFAULT NULL COMMENT '歌单作者',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `create_by` bigint unsigned NOT NULL COMMENT '记录创建者',
  `update_by` bigint unsigned DEFAULT NULL COMMENT '记录更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of song_sheet
-- ----------------------------
BEGIN;
INSERT INTO `song_sheet` (`id`, `type`, `sheet_id`, `user_id`, `name`, `author`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022829796190208, 'wygd', 4022829796190208, 4022816221063168, '日漫主题曲', 'ycode', '2024-01-14 06:57:45', '2024-01-27 15:05:34', 4022816221063168, 4022816221063168);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint unsigned NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户账号',
  `password` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户密码',
  `qq` varchar(15) DEFAULT NULL COMMENT 'QQ号码',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱地址',
  `status` int NOT NULL DEFAULT '0' COMMENT '状态 1:启用 0:禁用',
  `create_ip` varchar(32) DEFAULT NULL COMMENT '创建时ip',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `create_by` bigint unsigned DEFAULT NULL COMMENT '记录创建者',
  `update_by` bigint unsigned DEFAULT NULL COMMENT '记录更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `username`, `password`, `qq`, `email`, `status`, `create_ip`, `last_login_time`, `create_time`, `update_time`, `create_by`, `update_by`) VALUES (4022816221063168, 'ycode', '3f5e9a56d9c9fa71ee5add253fe1ad99', '1', '1', 1, '1', '2020-05-17 23:33:32', '2024-01-14 06:58:22', '2024-01-27 15:04:05', 4022816221063168, 4022816221063168);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
