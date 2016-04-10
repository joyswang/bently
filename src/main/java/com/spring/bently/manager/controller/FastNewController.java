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

import com.google.common.collect.Lists;
import com.spring.bently.manager.dao.ClubDynamicDao;
import com.spring.bently.manager.dao.ClubSummaryDao;
import com.spring.bently.manager.dao.UserDao;
import com.spring.bently.manager.model.ClubDynamic;
import com.spring.bently.manager.model.ClubSummary;
import com.spring.bently.manager.model.User;
import com.spring.bently.manager.pagedata.BentlyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

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

    @Autowired
    private ClubDynamicDao clubDynamicDao;

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
            clubSummary.setUpdateTime(new Date());
            clubSummary.setHandleuser("yong.zou");
            ClubSummary result = clubSummaryDao.save(clubSummary);
            return BentlyResponse.success(result);
        }
    }


    @RequestMapping("/get/clubDynamicList")
    public BentlyResponse getClubDynamicList(){
        List<ClubDynamic> list = Lists.newArrayList();
        Iterator<ClubDynamic> iterable = clubDynamicDao.findAll().iterator();
        if(iterable.hasNext()){
            list.add(iterable.next());
        }
        return BentlyResponse.success(list);
    }

    @RequestMapping("/update/clubDynamic")
    public BentlyResponse updateClubDynamic(@RequestBody ClubDynamic clubDynamic){
        clubDynamic.setHandleuser("yong.zou");
        clubDynamic.setUpdateTime(new Date());
        ClubDynamic result = clubDynamicDao.save(clubDynamic);
        if(result == null){
            return BentlyResponse.fail("保存数据异常，请稍后重试！");
        }else{
            return BentlyResponse.success(clubDynamic);
        }

    }

    @RequestMapping("/get/clubDynamic")
    public BentlyResponse getClubDynamic(long id){
        ClubDynamic result = clubDynamicDao.findOne(id);
        if(result == null){
            return BentlyResponse.fail("数据查询异常，请稍后重试！");
        }else{
            return BentlyResponse.success(result);
        }
    }

    @RequestMapping("/save/clubDynamic")
    public BentlyResponse saveClubDynamic(@RequestBody ClubDynamic clubDynamic){

        clubDynamic.setHandleuser("yong.zou");
        clubDynamic.setUpdateTime(new Date());
        ClubDynamic result = clubDynamicDao.save(clubDynamic);

        if(result == null){
            return BentlyResponse.fail("数据保存出错");
        }else{
            return BentlyResponse.success(result);
        }

    }





}
