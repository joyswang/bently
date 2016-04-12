package com.spring.bently.wx.controller.member;

import com.spring.bently.manager.dao.MemberDao;
import com.spring.bently.manager.model.Member;
import com.spring.bently.wx.controller.common.CommonController;
import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by wgq on 16-4-12.
 */
@Controller
@RequestMapping("/wx/member/rescue")
public class RescueController extends CommonController {

    private static Logger log = LoggerFactory.getLogger(RescueController.class) ;

    @Autowired
    private MemberDao memberDao ;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String view(HttpServletRequest request,HttpSession session, Model model) {
        Map userinfoMap = this.setUserInfoSession(request,session) ;

        if(userinfoMap == null) {
            return "error" ;
        }
        log.info("userinfoMap = " + userinfoMap.toString());

        String openid = userinfoMap.get("openid").toString() ;
        Member member = memberDao.findByWechatid(openid) ;
        if(member == null) {
            model.addAttribute("msg",WeixinPropertiesUtils.getProperties("un_subscribe_message")) ;
            //model.addAttribute("url","") ;
            return "warning" ;
        }
        if(!member.getIsSubscribe()) {
            model.addAttribute("msg",WeixinPropertiesUtils.getProperties("un_subscribe_message")) ;
            return "warning" ;
        }
        if(!member.getIsVip()) {
            model.addAttribute("msg",WeixinPropertiesUtils.getProperties("vip_message")) ;
            model.addAttribute("url","/wx/member/recharge") ;
            return "warning" ;
        }


        return "member/rescue" ;
    }
}
