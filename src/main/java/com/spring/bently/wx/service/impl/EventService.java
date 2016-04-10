package com.spring.bently.wx.service.impl;

import com.spring.bently.manager.dao.ClubDynamicDao;
import com.spring.bently.manager.dao.ClubSummaryDao;
import com.spring.bently.manager.model.ClubDynamic;
import com.spring.bently.manager.model.ClubSummary;
import com.spring.bently.wx.common.MenuEnum;
import com.spring.bently.wx.utils.ResponseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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
    private ClubDynamicDao clubDynamicDao ;

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
                return ResponseUtils.textResponse(map, "正在开发中...") ;
            case club_dy:

                Sort sort = new Sort(Sort.Direction.DESC, "id");
                Pageable pageable = new PageRequest(0,5,sort) ;
                //Sort sort = new Sort() ;
                Page<ClubDynamic> page = clubDynamicDao.findAll(pageable) ;
                log.info("list.size = " + page.getSize());
                List<ClubDynamic> list = new ArrayList<ClubDynamic>() ;
                for(Iterator itr = page.iterator();itr.hasNext();) {
                    ClubDynamic clubDynamic = (ClubDynamic)itr.next() ;
                    list.add(clubDynamic);
                }

                return ResponseUtils.newsResponse(map,list) ;
            case user_activity:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case hotel_destine:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case ykt_destine:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case activity_destine:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case wash_car:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case waxing:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case maintence:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case rescue:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            case secretary:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
            default:
                return ResponseUtils.textResponse(map,"正在开发中...") ;
        }
    }

    @Override
    public String subscribeEvent(Map<String, String> map) {
        return ResponseUtils.textResponse(map,"正在开发中...");
    }

    @Override
    public String unsubscribeEvent(Map<String, String> map) {
        return ResponseUtils.textResponse(map,"正在开发中...");
    }

    @Override
    public String scanEvent(Map<String, String> map) {
        return ResponseUtils.textResponse(map,"正在开发中...");
    }

    @Override
    public String locationEvent(Map<String, String> map) {
        return ResponseUtils.textResponse(map,"正在开发中...");
    }

    @Override
    public String viewEvent(Map<String, String> map) {
        return ResponseUtils.textResponse(map,"正在开发中...");
    }
}
