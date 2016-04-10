package com.spring.bently.wx.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wgq on 16-4-10.
 */
public class ResponseUtils {
    public static String textResponse(Map<String,String> map, String returnValue) {
        Map<String,Object> returnMap = new HashMap<String,Object>() ;
        returnMap.put("ToUserName",map.get("fromusername")) ;
        returnMap.put("FromUserName",map.get("tousername")) ;
        returnMap.put("CreateTime",new Date().getTime()) ;
        returnMap.put("MsgType","text") ;
        returnMap.put("Content",returnValue) ;

        StringBuffer sb = new StringBuffer() ;
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>") ;
        sb.append("<xml>");
        sb.append("<ToUserName><![CDATA[" + map.get("fromusername") + "]]></ToUserName>");
        sb.append("<FromUserName><![CDATA[" + map.get("tousername") + "]]></FromUserName>");
        sb.append("<CreateTime>" + Calendar.getInstance().getTimeInMillis() / 1000 + "</CreateTime>");
        sb.append("<MsgType><![CDATA[text]]></MsgType>");
        sb.append("<Content><![CDATA[" + returnValue + "]]></Content>");
        sb.append("</xml>");



        return sb.toString() ;
        //return XmlUtils.mapToXml(returnMap) ;
    }
}
