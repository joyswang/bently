package com.wx.test;

import com.spring.wx.utils.httptool.CustomHttpsConnection;
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
        //{"access_token":"1DrQZo_5jLymAx3GOEy5_w_jo_8sB3X3WLrkSOdBXKEKZ42veiI3ssHtubWUiONc7baga3ymyxRKptBVM8ir7MvavwVR8DfwLmFa0y12Ul-S6EOViCto8jdm4CsiBtaBERSfADAREF","expires_in":7200}
        CustomHttpsConnection connection =
                new CustomHttpsConnection("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxff3d1c1de2bd91fe&secret=adf7f3377400add0b0b4698af5a1fc58", "GET") ;
        String message = connection.httpsClient(null) ;
        System.out.println(message);
    }
}
