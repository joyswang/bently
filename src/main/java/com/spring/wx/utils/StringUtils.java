package com.spring.wx.utils;

/**
 * Created by wgq on 16-3-31.
 */
public class StringUtils {

    public static boolean isEmpty(String str) {
        if(str == null || "".equals(str)) {
            return true ;
        }
        return false ;
    }

    public static String replaceEach(String url, String ... values) {

        //String reg = "{[]}" ;
        for(String value : values) {
            url = url.replaceFirst("\\{\\[\\]\\}",value) ;
        }
        return url ;

        //return org.apache.commons.lang3.StringUtils.replaceEach(url,new String[]{"{[]}"},values) ;
    }
}
