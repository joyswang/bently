package com.spring.bently.wx.utils;

import java.io.*;
import java.util.Properties;

/**
 * Created by wgq on 16-4-4.
 */
public class WeixinPropertiesUtils {

    private static Properties prop ;

    static {
        prop = new Properties() ;
        try {
            InputStream in = new BufferedInputStream(WeixinPropertiesUtils.class.getResourceAsStream("/wx/weixin.properties")) ;
            prop.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String key) {
        return prop.getProperty(key) ;
    }

    public static void setProperties(String key, String value) {
        prop.setProperty(key, value) ;
    }
}
