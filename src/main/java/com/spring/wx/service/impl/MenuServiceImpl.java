package com.spring.wx.service.impl;

import com.spring.wx.service.MenuService;
import com.spring.wx.utils.StringUtils;
import com.spring.wx.utils.WeixinPropertiesUtils;
import com.spring.wx.utils.httptool.CustomHttpsConnection;
import com.spring.wx.utils.httptool.HttpConnectionCommon;

import org.springframework.stereotype.Service;

/**
 * Created by wgq on 16-4-4.
 */
@Service
public class MenuServiceImpl implements MenuService {

    public String createMenu(String menu) {

        String create_menu_url = WeixinPropertiesUtils.getProperties("create_menu_url") ;
        String access_token = WeixinPropertiesUtils.getProperties("access_token") ;

        String postUrl = StringUtils.replaceEach(create_menu_url,access_token) ;
       // String postUrl = WeixinPropertiesUtils.getProperties("create_menu_url") + "?"
        HttpConnectionCommon hcc = new HttpConnectionCommon(postUrl, "POST") ;
        CustomHttpsConnection connection = new CustomHttpsConnection(hcc) ;
        String message = connection.httpsClient(menu) ;
        return message ;
    }
}
