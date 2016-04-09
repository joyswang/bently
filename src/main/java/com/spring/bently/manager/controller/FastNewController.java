/*
 * Create Author  : yong.zou
 * Create Date    : 2016-04-09
 * Project        : bently
 * File Name      : FastNew.java
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */
package com.spring.bently.manager.controller;

import com.spring.bently.manager.dao.ClubSummaryDao;
import com.spring.bently.manager.dao.UserDao;
import com.spring.bently.manager.model.ClubSummary;
import com.spring.bently.manager.model.User;
import com.spring.bently.manager.pagedata.BentlyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

/**
 * 功能描述:  <p>
 *
 * @author : yong.zou <p>
 * @version 1.0 2016-04-09
 * @since bently 1.0
 */
@RestController
public class FastNewController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ClubSummaryDao clubSummaryDao;

    @RequestMapping("/get/summary")
    public BentlyResponse getSummary(){
        ClubSummary clubSummary = new ClubSummary();
        Iterator<ClubSummary> iterable = clubSummaryDao.findAll().iterator();
        if(iterable.hasNext()){
            clubSummary = iterable.next();
        }
        if(clubSummary == null ){
            return BentlyResponse.fail("数据异常，请稍后重试！");
        }else{
            return BentlyResponse.success(clubSummary);
        }
    }


    @RequestMapping("/update/summary")
    public BentlyResponse updateSummary(@RequestBody ClubSummary clubSummary){

        if(clubSummary == null ){
            return BentlyResponse.fail("数据异常，请稍后重试！");
        }else{
            ClubSummary result = clubSummaryDao.save(clubSummary);
            return BentlyResponse.success(result);
        }
    }



}
