package com.spring.wx.schedule;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.wx.utils.StringUtils;
import com.spring.wx.utils.WeixinPropertiesUtils;
import com.spring.wx.utils.httptool.CustomHttpsConnection;
import com.spring.wx.utils.httptool.HttpConnectionCommon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wgq on 16-4-4.
 */
@Component
public class AccessTokenSchedule {

    private static Logger log = LoggerFactory.getLogger(AccessTokenSchedule.class) ;

    //每个小时触发一次
    @Scheduled(cron = "0 0 * * * ?")
    public void getAccessToken() {

        String access_token_url = WeixinPropertiesUtils.getProperties("access_token_url") ;
        String appid = WeixinPropertiesUtils.getProperties("appid") ;
        String secret = WeixinPropertiesUtils.getProperties("secret") ;

        String postUrl = StringUtils.replaceEach(access_token_url,appid,secret) ;

        HttpConnectionCommon hcc = new HttpConnectionCommon(postUrl, "GET") ;
        CustomHttpsConnection connection = new CustomHttpsConnection(hcc) ;
        String jsonResult = connection.httpsClient(null) ;
        log.info("jsonResult = " + jsonResult);
        ObjectMapper om = new ObjectMapper() ;
        Map map = null ;
        try {
            map = om.readValue(jsonResult, HashMap.class) ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        String errcode = map.get("errcode")==null?"":map.get("errcode").toString() ;
        if(StringUtils.isEmpty(errcode)) {
            WeixinPropertiesUtils.setProperties("access_token",map.get("access_token").toString());
        }

    }
}
