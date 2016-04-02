package com.wx.test;

import com.spring.wx.utils.httptool.CustomHttpsConnection;
import com.spring.wx.utils.httptool.HttpConnectionCommon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wgq on 16-4-2.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration
public class MyTest {

    @Test
    public void testHttps() {
        //{"access_token":"FI269TpHVc4LKEzpHyqEEPe740gAq7DCo26F5QyotKs2X9Ex-ppjphxEYqix0zc7iV4e4TU3w7t1TZ7ap1f-jhNedLqntLoJyYzyKwVK6biztbLH4ZR27ZnB6EkcedpVLXYgAIAZLM","expires_in":7200}
        HttpConnectionCommon hcc =
                new HttpConnectionCommon("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxff3d1c1de2bd91fe&secret=adf7f3377400add0b0b4698af5a1fc58", "GET") ;
        CustomHttpsConnection connection = new CustomHttpsConnection(hcc) ;
        String message = connection.httpsClient(null) ;
        System.out.println(message);
    }
}
