//package com.wink.music.controller;
//
//
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//@Slf4j
//@RestController
//@RequestMapping("/player")
//@CrossOrigin
//@Tag(name = "SongSheetController", description = "")
//public class TempPlayerController {
//
//
//    @GetMapping(value = "/mainColor")
//    public String mainColor() throws IOException {
//        return "{\"myhkcolor\":\"168,155,148\",\"myhkfcolor\":\"0,0,0\"}";
//    }
//
//
//    @GetMapping("/songSheet")
//    @Operation(summary = "通过主键查询")
//    public String songSheet(@RequestParam("id") Long id){
//        log.info("访问啦");
//        return "{\n" +
//                "    \"keyId\": \"170515980940\",\n" +
//                "    \"myhkqq\": 123123123,\n" +
//                "    \"playerName\": \"wenqin playerName\",\n" +
//                "    \"randomPlayer\": 0,\n" +
//                "    \"defaultVolume\": 75,\n" +
//                "    \"showLrc\": 1,\n" +
//                "    \"randcolor\": 0,\n" +
//                "    \"playerWidth\": -1,\n" +
//                "    \"coverWidth\": -1,\n" +
//                "    \"letterfx\": 1,\n" +
//                "    \"showGreeting\": 1,\n" +
//                "    \"defaultAlbum\": 1,\n" +
//                "    \"siteName\": \"wenqin siteName\",\n" +
//                "    \"greeting\": \"wenqin greeting\",\n" +
//                "    \"switchopen\": 1,\n" +
//                "    \"time\": 5,\n" +
//                "    \"errNext\": 1,\n" +
//                "    \"errNum\": 3,\n" +
//                "    \"autoPlayer\": 1,\n" +
//                "    \"mautoPlayer\": 1,\n" +
//                "    \"background\": 1,\n" +
//                "    \"showNotes\": 0,\n" +
//                "    \"showMsg\": 0,\n" +
//                "    \"myhkversion\": \"17052244030\",\n" +
//                "    \"myhkid\": \"undefined\",\n" +
//                "    \"songSheetList\": [\n" +
//                "        {\n" +
//                "            \"songSheetName\": \"hello\",\n" +
//                "            \"author\": \"hello\",\n" +
//                "            \"songId\": [\n" +
//                "                \"93dd151c36db4ec1855985aca4a51293\",\n" +
//                "                \"acc73987d29b4b578bcb2c6579a7c19d\"\n" +
//                "            ],\n" +
//                "            \"songIds\": [\n" +
//                "                \"1330348068\",\n" +
//                "                \"1363948882\"\n" +
//                "            ],\n" +
//                "            \"songNames\": [\n" +
//                "                \"起风了\",\n" +
//                "                \"世间美好与你环环相扣\"\n" +
//                "            ],\n" +
//                "            \"songTypes\": [\n" +
//                "                \"wy\",\n" +
//                "                \"wy\"\n" +
//                "            ],\n" +
//                "            \"albumNames\": [\n" +
//                "                \"起风了\",\n" +
//                "                \"听闻余生\"\n" +
//                "            ],\n" +
//                "            \"artistNames\": [\n" +
//                "                \"买辣椒也用券\",\n" +
//                "                \"柏松\"\n" +
//                "            ],\n" +
//                "            \"albumCovers\": [\n" +
//                "                \"251dfa1cec04493a836e797be3d4a8fd\",\n" +
//                "                \"28c8877980cc4c95856bc009fe8cdf02\"\n" +
//                "            ],\n" +
//                "            \"locations\": [\n" +
//                "                \"\",\n" +
//                "                \"\"\n" +
//                "            ],\n" +
//                "            \"sign\": [\n" +
//                "                \"afqxxDbQbUS42\",\n" +
//                "                \"9f7FSCQIgKXVY\"\n" +
//                "            ]\n" +
//                "        }\n" +
//                "    ]\n" +
//                "}";
//    }
//
//
//}
