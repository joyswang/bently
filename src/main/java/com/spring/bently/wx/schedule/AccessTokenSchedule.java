package com.spring.bently.wx.schedule;

import com.spring.bently.manager.dao.AccessTokenDao;
import com.spring.bently.manager.model.AccessToken;
import com.spring.bently.wx.utils.JsonUtils;
import com.spring.bently.wx.utils.StringUtils;
import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import com.spring.bently.wx.utils.httptool.CustomHttpsConnection;
import com.spring.bently.wx.utils.httptool.HttpConnectionCommon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by wgq on 16-4-4.
 */
@Component
public class AccessTokenSchedule {

    private static Logger log = LoggerFactory.getLogger(AccessTokenSchedule.class) ;

    @Autowired
    private AccessTokenDao accessTokenDao ;

    //每个小时触发一次
    @Scheduled(cron = "0 0 * * * ?")
    public void getAccessToken() {
        log.info("进入access_token........");

        String access_token_url = WeixinPropertiesUtils.getProperties("access_token_url") ;
        String appid = WeixinPropertiesUtils.getProperties("appid") ;
        String secret = WeixinPropertiesUtils.getProperties("secret") ;

        String postUrl = StringUtils.replaceEach(access_token_url,appid,secret) ;
        log.info("postUrl = " + postUrl);

        HttpConnectionCommon hcc = new HttpConnectionCommon(postUrl, "GET") ;
        CustomHttpsConnection connection = new CustomHttpsConnection(hcc) ;
        String jsonResult = connection.httpsClient(null) ;
        log.info("jsonResult = " + jsonResult);
        Map map = JsonUtils.jsonToMap(jsonResult);
        if(map == null) {
            log.info("获取access_token的json格式字符串有问题，无法转成map对象");
            return ;
        }

        String errcode = map.get("errcode")==null?"":map.get("errcode").toString() ;
        if(StringUtils.isEmpty(errcode)) {

            AccessToken accessToken = accessTokenDao.findOne(1L);
            accessToken.setAccesstoken(map.get("access_token").toString());
            accessTokenDao.save(accessToken) ;
            //WeixinPropertiesUtils.setProperties("access_token",map.get("access_token").toString());
        }

    }
}
