package com.spring.wx.controller;

import com.spring.wx.utils.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wgq on 16-4-2.
 */
@RestController
public class EntranceController {

    private static Logger log = LoggerFactory.getLogger(EntranceController.class) ;

    @RequestMapping(value = "/entrance", method = RequestMethod.GET)
    public String entranceGet(HttpServletRequest request) {
        if(checkSignature(request)) {
            String echostr = request.getParameter("echostr") ;
            return echostr ;
        }


        return "null" ;
    }

    @RequestMapping(value = "/entrance", method = RequestMethod.POST)
    public String entrancePost(HttpServletRequest request) {

        return this.entranceGet(request) ;
    }


    //微信接入检查参数
    private boolean checkSignature(HttpServletRequest request) {
        String signature = request.getParameter("signature") ;
        String timestamp = request.getParameter("timestamp") ;
        String nonce = request.getParameter("nonce") ;

        log.info("signature = " + signature +
        "timestamp = " + timestamp +
        "nonce = " + nonce ) ;

        String token = "spring_weixin_wgq" ;

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
