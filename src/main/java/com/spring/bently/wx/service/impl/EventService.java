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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
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
        log.info("进入到clickEvent中......");
        switch (MenuEnum.valueOf(eventkey)) {
            case club_profile:
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
            default:
                return ResponseUtils.textResponse(map,"success") ;
        }
    }

    @Override
    public String subscribeEvent(Map<String, String> map) {
        List<AccessToken> list = accessTokenDao.findByType("normal") ;
        if(list.size() == 0) {
            log.info("AccessToken不存在，请往数据库中添加");
            return "success" ;
        }
        AccessToken accessToken = list.get(0) ;
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


        return ResponseUtils.textResponse(map,"欢迎关注宾利俱乐部微信服务号..");
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
        return ResponseUtils.textResponse(map,"欢迎关注宾利俱乐部微信服务号..");
    }

    @Override
    public String locationEvent(Map<String, String> map) {
        return "success";
    }

    @Override
    public String viewEvent(Map<String, String> map) {
        return "success";
    }
}
