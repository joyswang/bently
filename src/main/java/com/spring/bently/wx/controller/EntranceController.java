package com.spring.bently.wx.controller;

import com.spring.bently.wx.utils.StringUtils;
import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import com.spring.bently.wx.utils.XmlUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by wgq on 16-4-2.
 */
@RestController
public class EntranceController {

    private static Logger log = LoggerFactory.getLogger(EntranceController.class) ;

    @RequestMapping(value = "/entrance", method = RequestMethod.GET)
    public String entranceGet(HttpServletRequest request) {
        String echostr = request.getParameter("echostr") ;
        log.info("echostr = " + echostr);
        //第一次接入的时候需要检查
        if(echostr != null) {
            if (checkSignature(request)) {
                return echostr;
            }
        }
        getMessagePost(request) ;

        return "" ;
    }

    @RequestMapping(value = "/entrance", method = RequestMethod.POST)
    public String entrancePost(HttpServletRequest request) {

        return this.entranceGet(request) ;
    }

    //处理微信发送的请求
    private String getMessagePost(HttpServletRequest request) {
        try {
            InputStream inputStream = request.getInputStream() ;
            Map msgMap = XmlUtils.xmlToMap(inputStream) ;
            log.info("msgMap = " + msgMap.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success" ;

    }


    //微信接入检查参数
    private boolean checkSignature(HttpServletRequest request) {
        String signature = request.getParameter("signature") ;
        String timestamp = request.getParameter("timestamp") ;
        String nonce = request.getParameter("nonce") ;

        log.info("signature = " + signature +
        "timestamp = " + timestamp +
        "nonce = " + nonce ) ;

        String token = WeixinPropertiesUtils.getProperties("token");

        if(StringUtils.isEmpty(signature)) {
            return false ;
        }

        String[] arry = {timestamp, nonce, token} ;
        Arrays.sort(arry);

        String tmpStr = arry[0] + arry[1] + arry[2] ;
        String tmpStr1 = DigestUtils.sha1Hex(tmpStr) ;
        log.info("tmpStr1 = " + tmpStr1) ;

        if(signature.equals(tmpStr1)) {
            return true ;
        }

        return false ;
    }
}
