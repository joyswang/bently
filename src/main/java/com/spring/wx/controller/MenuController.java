package com.spring.wx.controller;

import com.spring.wx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wgq on 16-4-4.
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService ;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {

        /*{
            "button":[
            {
                "type":"click",
                    "name":"今日歌曲",
                    "key":"V1001_TODAY_MUSIC"
            },
            {
                "name":"菜单",
                    "sub_button":[
                {
                    "type":"view",
                        "name":"搜索",
                        "url":"http://www.soso.com/"
                },
                {
                    "type":"view",
                        "name":"视频",
                        "url":"http://v.qq.com/"
                },
                {
                    "type":"click",
                        "name":"赞一下我们",
                        "key":"V1001_GOOD"
                }]
            }]
        }*/

        String menu = "{\"button\" : [{\"type\" : \"view\",\"name\":\"百度\",\"url\":\"http://www.baidu.com\"}]}" ;


        return menuService.createMenu(menu) ;
    }
}
