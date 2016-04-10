package com.wx.test;

import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import com.spring.bently.wx.utils.httptool.CustomHttpConnection;
import com.spring.bently.wx.utils.httptool.CustomHttpsConnection;
import com.spring.bently.wx.utils.httptool.HttpConnectionCommon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;

/**
 * Created by wgq on 16-4-2.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration
public class MyTest {

    @Test
    public void testHttps() {
        //{"access_token":"Hht0QmyysCpgJpD4WXH_36OymMJW00Xn1kbNU5HVoPodLCKcvDETCa1G9IHDrhse72KPDkAqXmIznPLLmVKkQ6Wz2MxxpNzRKEE4vEbCpXvUWFK83ohEgDuH5M_65e8YVLQiAAAFVA","expires_in":7200}
        HttpConnectionCommon hcc =
                new HttpConnectionCommon("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxff3d1c1de2bd91fe&secret=adf7f3377400add0b0b4698af5a1fc58", "GET") ;
        CustomHttpsConnection connection = new CustomHttpsConnection(hcc) ;
        String message = connection.httpsClient(null) ;
        System.out.println(message);
    }

    @Test
    public void testWXProperties() {
        System.out.println(WeixinPropertiesUtils.getProperties("access_token"));
    }

    @Test
    public void testReturn() {
        HttpConnectionCommon hcc =
                new HttpConnectionCommon("http://wgq.tunnel.qydev.com/entrance", "POST") ;
        CustomHttpConnection connection = new CustomHttpConnection(hcc) ;
        StringBuffer buf = new StringBuffer() ;

        buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>") ;
        buf.append("<xml>");
        buf.append("<ToUserName><![CDATA[gh_6f1ea73d1913]]></ToUserName>");
        buf.append("<FromUserName><![CDATA[oygVcwB3xFoQqOTklmOBcdyiMU50]]></FromUserName>");
        buf.append("<CreateTime>1460230912</CreateTime>");
        buf.append("<MsgType><![CDATA[event]]></MsgType>");
        buf.append("<Event><![CDATA[CLICK]]></Event>");
        buf.append("<EventKey><![CDATA[ykt_destine]]></EventKey>");
        buf.append("</xml>");

        String message = connection.httpClient(buf.toString()) ;
        System.out.println(message);

    }
}
