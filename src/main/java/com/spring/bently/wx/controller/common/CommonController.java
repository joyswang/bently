package com.spring.bently.wx.controller.common;

import com.spring.bently.manager.dao.MemberDao;
import com.spring.bently.manager.model.Member;
import com.spring.bently.wx.utils.WebAccessTokenUtil;
import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by wgq on 16-4-12.
 */
public class CommonController {

    private static Logger log = LoggerFactory.getLogger(CommonController.class) ;

    public Map setUserInfoSession(HttpServletRequest request,HttpSession session) {
        Map map = null ;
        if(session.getAttribute("userinfoMap") == null) {
            log.info("userinfoMap不存在");
            String code = request.getParameter("code") ;
            if(code == null) {
                log.info("没有从指定的url进入导致code为空");
                return null ;
            }
            map = WebAccessTokenUtil.access_token_request(code) ;
            if(map == null) {
                log.info("获取用户的微信信息失败");
                return null ;
            }
            session.setAttribute("userinfoMap", map);
        }else {
            map = (Map) session.getAttribute("userinfoMap") ;
        }

        return map ;
    }

    public String checkIsMemberAndIsVip(Map<String,String> map, MemberDao memberDao) {
        String openid = map.get("openid") ;
        Member member = memberDao.findByWechatid(openid) ;
        if(member == null) {
            return WeixinPropertiesUtils.getProperties("un_subscribe_message") ;
        }
        if(!member.getIsSubscribe()) {
            return WeixinPropertiesUtils.getProperties("un_subscribe_message") ;
        }
        if(!member.getIsVip()) {
            StringBuilder builder = new StringBuilder(WeixinPropertiesUtils.getProperties("vip_message")) ;
            return builder.toString() ;
        }
        return null ;
    }
}
