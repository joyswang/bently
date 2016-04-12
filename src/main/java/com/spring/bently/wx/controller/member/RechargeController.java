package com.spring.bently.wx.controller.member;

import com.spring.bently.manager.dao.AccessTokenDao;
import com.spring.bently.manager.model.AccessToken;
import com.spring.bently.wx.controller.common.CommonController;
import com.spring.bently.wx.utils.JsSdkSign;
import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by wgq on 16-4-11.
 */
@Controller
@RequestMapping("/wx/member/recharge")
public class RechargeController extends CommonController {

    @Autowired
    private AccessTokenDao accessTokenDao ;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String view(HttpServletRequest request, HttpSession session,ModelMap model) {
        Map userinfoMap = this.setUserInfoSession(request,session) ;

        if(userinfoMap == null) {
            return "error" ;
        }
        //log.info("userinfoMap = " + userinfoMap.toString());
        //ret.put("url", url);
        //ret.put("jsapi_ticket", jsapi_ticket);
        //ret.put("nonceStr", nonce_str);
        //ret.put("timestamp", timestamp);
        //ret.put("signature", signature);

        String url = request.getScheme()+"://"+request.getServerName()+"/wx/member/recharge";
        System.out.println("url = " + url);
        AccessToken jsapiticket = accessTokenDao.findByType("jsapi_ticket") ;
        Map<String, String> map = JsSdkSign.sign(jsapiticket.getAccesstoken(),url) ;
        map.put("appid", WeixinPropertiesUtils.getProperties("appid")) ;
        System.out.println("map = " + map.toString());
        model.putAll(map);
        //model.addAttribute("prop",map) ;

        return "member/recharge" ;
    }

    @RequestMapping(value = "/charge",method = RequestMethod.GET)
    public String recharge(Model model) {

        model.addAttribute("msg","充值成功") ;
        return "success" ;
    }
}
