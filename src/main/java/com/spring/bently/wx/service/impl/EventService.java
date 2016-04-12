package com.spring.bently.wx.service.impl;

import com.spring.bently.manager.dao.AccessTokenDao;
import com.spring.bently.manager.dao.ClubSummaryDao;
import com.spring.bently.manager.dao.MemberDao;
import com.spring.bently.manager.model.AccessToken;
import com.spring.bently.manager.model.ClubSummary;
import com.spring.bently.manager.model.Member;
import com.spring.bently.wx.common.MenuEnum;
import com.spring.bently.wx.utils.ResponseUtils;
import com.spring.bently.wx.utils.WebAccessTokenUtil;
import com.spring.bently.wx.utils.WeixinPropertiesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by wgq on 16-4-10.
 */
@Component
public class EventService extends AbstractEventService {

    private static Logger log = LoggerFactory.getLogger(EventService.class) ;

    @Autowired
    private ClubSummaryDao clubSummaryDao ;

    @Autowired
    private AccessTokenDao accessTokenDao ;

    @Autowired
    private MemberDao memberDao ;

    @Override
    public String clickEvent(Map<String, String> map) {
        String eventkey = map.get("eventkey") ;
        String openid = map.get("fromusername") ;
        String checkMsg = null ;
        log.info("进入到clickEvent中......");
        switch (MenuEnum.valueOf(eventkey)) {
            case club_profile:
            {
                Iterator<ClubSummary> iterable = clubSummaryDao.findAll().iterator();
                ClubSummary clubSummary = null ;
                if(iterable.hasNext()){
                    clubSummary = iterable.next();
                }
                log.info(clubSummary.toString());
                if(clubSummary != null) {
                    return ResponseUtils.textResponse(map, clubSummary.getContext()) ;
                }
                return "success" ;
            }

            case secretary:
                return ResponseUtils.textResponse(map,WeixinPropertiesUtils.getProperties("xiaomishu")) ;
            default:
                return ResponseUtils.textResponse(map,WeixinPropertiesUtils.getProperties("common_text_message")) ;
        }
    }

    @Override
    public String subscribeEvent(Map<String, String> map) {
        AccessToken accessToken = accessTokenDao.findByType("normal") ;
        if(accessToken == null) {
            log.info("AccessToken不存在，请往数据库中添加");
            return "success" ;
        }
        String openid = map.get("fromusername") ;
        Member member = memberDao.findByWechatid(openid) ;
        if(member == null) {
            Map userinfomap = WebAccessTokenUtil.userinfo_request_normal(accessToken.getAccesstoken(), openid) ;
            log.info("用户关注后获取userinfo：" + userinfomap.toString());

            member = new Member() ;
            member.setWechatid(userinfomap.get("openid").toString());
            member.setWechatname(userinfomap.get("nickname").toString());
            member.setIsVip(false);
            member.setIsSubscribe(true);
            memberDao.save(member) ;

        }else {
            log.info("当前用户已经存在，只修改订阅状态");
            member.setIsSubscribe(true);
            memberDao.save(member) ;
        }


        return ResponseUtils.textResponse(map,WeixinPropertiesUtils.getProperties("subscribe_message"));
    }

    @Override
    public String unsubscribeEvent(Map<String, String> map) {
        String openid = map.get("fromusername") ;
        Member member = memberDao.findByWechatid(openid) ;
        member.setIsSubscribe(false);
        memberDao.save(member) ;
        return "success";
    }

    @Override
    public String scanEvent(Map<String, String> map) {
        return ResponseUtils.textResponse(map,WeixinPropertiesUtils.getProperties("subscribe_message"));
    }

    @Override
    public String locationEvent(Map<String, String> map) {
        return "success";
    }

    @Override
    public String viewEvent(Map<String, String> map) {
        return "success";
    }


    private String check(String openid,Map<String,String> map) {
        Member member = memberDao.findByWechatid(openid) ;
        if(member == null) {
            return ResponseUtils.textResponse(map,WeixinPropertiesUtils.getProperties("un_subscribe_message")) ;
        }
        if(!member.getIsSubscribe()) {
            return ResponseUtils.textResponse(map,WeixinPropertiesUtils.getProperties("un_subscribe_message")) ;
        }
        if(!member.getIsVip()) {
            StringBuilder builder = new StringBuilder(WeixinPropertiesUtils.getProperties("vip_message")+"\n\n") ;
            builder.append("<a href=\"" + WeixinPropertiesUtils.getProperties("webUrl") + "wx/member/recharge\">加入我们</a>") ;
            return ResponseUtils.textResponse(map, builder.toString()) ;
        }
        return null ;
    }

}
