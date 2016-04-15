package com.spring.bently.wx.controller.member;

import com.spring.bently.manager.dao.MemberDao;
import com.spring.bently.wx.controller.common.CommonController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by wgq on 16-4-12.
 */
@Controller
@RequestMapping("/wx/member/waxing")
public class WaxingController extends CommonController {

    private static Logger log = LoggerFactory.getLogger(WaxingController.class) ;

    @Autowired
    private MemberDao memberDao ;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String view(HttpServletRequest request,HttpSession session, ModelMap model) {
        String url = this.checkIsMemberAndIsVip(request,session,model) ;
        if(url != null) {
            return url ;
        }

        return "member/waxing" ;
    }

    @Override
    public MemberDao getMemberDao() {
        return memberDao;
    }
}
