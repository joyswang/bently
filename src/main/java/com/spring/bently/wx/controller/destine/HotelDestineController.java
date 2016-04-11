package com.spring.bently.wx.controller.destine;

import com.spring.bently.manager.dao.HotelDestineDao;
import com.spring.bently.manager.model.HotelDestine;
import com.spring.bently.wx.utils.DateUtils;
import com.spring.bently.wx.utils.WebAccessTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * Created by wgq on 16-4-10.
 */
@Controller
@RequestMapping("/wx/hotel/destine")
public class HotelDestineController {

    private static Logger log = LoggerFactory.getLogger(HotelDestineController.class) ;

    @Autowired
    private HotelDestineDao hotelDestineDao ;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String view(HttpServletRequest request,HttpSession session) {
        Map map = null ;
        if(session.getAttribute("userinfoMap") == null) {
            log.info("userinfoMap不存在");
            String code = request.getParameter("code") ;
            map = WebAccessTokenUtil.access_token_request(code) ;
            if(map == null) {
                log.info("获取用户的微信信息失败");
                return "error" ;
            }
            session.setAttribute("userinfoMap", map);
        }else {
            map = (Map) session.getAttribute("userinfoMap") ;
            log.info("userinfoMap存在");
        }
        log.info("userinfoMap = " + map.toString());

        return "destine/hoteldestine" ;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveHotelDestine(HttpServletRequest request,HttpSession session) {

        if(session.getAttribute("userinfoMap") == null) {
            log.info("saveHotelDestine 方法时，无法获取web_access_token");
            return "error" ;
        }
        Map map = (Map) session.getAttribute("userinfoMap") ;
        String destinedate = request.getParameter("destinedate") ;

        String daynum = request.getParameter("daynum") ;
        try {
            log.info("destinedate = " + destinedate + ":" + DateUtils.stringToDate(destinedate));
            HotelDestine hotelDestine = new HotelDestine() ;
            hotelDestine.setDaynum(Integer.parseInt(daynum));

            hotelDestine.setDestinetime(DateUtils.stringToDate(destinedate));
            hotelDestine.setWechatid(map.get("openid").toString());
            hotelDestine.setWechatname(map.get("nickname").toString());
            hotelDestine.setUpdateTime(new Date());
            hotelDestine.setIsHandle(false);
            hotelDestineDao.save(hotelDestine) ;
        }catch (Exception e) {
            e.printStackTrace();
            log.info("添加hotelDestine出错，错误信息：" + e.getMessage());
            return null ;
        }

        return "destine/destine_success" ;
    }

}
