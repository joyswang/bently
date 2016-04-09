package com.wx.test;

import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import com.spring.bently.wx.utils.httptool.CustomHttpsConnection;
import com.spring.bently.wx.utils.httptool.HttpConnectionCommon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wgq on 16-4-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration
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

    public static void main(String[] args) {
        MyTest m     = new MyTest() ;
        m.testHttps() ;
    }
}
