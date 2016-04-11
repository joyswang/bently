package com.spring.bently.wx.service.impl;

import com.spring.bently.wx.common.MsgTypeEnum;
import com.spring.bently.wx.service.IEntranceService;
import com.spring.bently.wx.service.IEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by wgq on 16-4-9.
 */
@Service
public class EntranceService implements IEntranceService {

    private static Logger log = LoggerFactory.getLogger(EntranceService.class) ;

    @Autowired
    private IEventService eventService ;

    @Override
    public String entrance(Map<String,String> map) {
        log.info("进入entranceService中......");
        if(map == null) {
            return "" ;
        }

        String event = map.get("msgtype") ;
        log.info("event = " + event);
        String msg = "" ;

        switch (MsgTypeEnum.valueOf(event)) {

            case image:
                return "success" ;
            case text:
                return "success" ;
            case voice:
                return "success" ;
            case video:
                return "success" ;
            case shortvideo:
                return "success" ;
            case location:
                return "success" ;
            case link:
                return "success" ;
            case event:
                log.info("进入event事件中......");
                msg = eventService.event(map) ;
                break;
            default:
                return "success" ;
        }



        return msg;
    }

}
