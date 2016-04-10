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
import com.spring.bently.manager.dao.*;
import com.spring.bently.manager.model.*;
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
public class DestineController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private HotelDestineDao hotelDestineDao;

    @Autowired
    private ClubDynamicDao clubDynamicDao;

    @Autowired
    private UserActivityDao userActivityDao;



    @RequestMapping("/get/hotelList")
    public BentlyResponse getHotelList(){
        List<HotelDestine> list = Lists.newArrayList();
        Iterator<HotelDestine> iterable = hotelDestineDao.findAll().iterator();
        while(iterable.hasNext()){
            list.add(iterable.next());
        }
        return BentlyResponse.success(list);
    }

    @RequestMapping("/update/hotel")
    public BentlyResponse updateHotel(@RequestBody HotelDestine hotelDestine){
        hotelDestine.setHandleuser("bentley");
        hotelDestine.setUpdateTime(new Date());
        HotelDestine result = hotelDestineDao.save(hotelDestine);
        if(result == null){
            return BentlyResponse.fail("保存数据异常，请稍后重试！");
        }else{
            return BentlyResponse.success(hotelDestine);
        }

    }

    @RequestMapping("/handle/hotel")
    public BentlyResponse handleHotel(String wechatid){

        HotelDestine hotelDestine = hotelDestineDao.findBywechatid(wechatid);
        hotelDestine.setIsHandle(true);
        hotelDestine.setHandleuser("bentley");
        hotelDestine.setUpdateTime(new Date());
        HotelDestine result = hotelDestineDao.save(hotelDestine);
        if(result == null){
            return BentlyResponse.fail("更新数据异常，请稍后重试！");
        }else{
            return BentlyResponse.success(hotelDestine);
        }

    }

//    @RequestMapping("/get/clubDynamic")
//    public BentlyResponse getClubDynamic(long id){
//        ClubDynamic result = clubDynamicDao.findOne(id);
//        if(result == null){
//            return BentlyResponse.fail("数据查询异常，请稍后重试！");
//        }else{
//            return BentlyResponse.success(result);
//        }
//    }
//
//    @RequestMapping("/save/clubDynamic")
//    public BentlyResponse saveClubDynamic(@RequestBody ClubDynamic clubDynamic){
//
//        clubDynamic.setHandleuser("yong.zou");
//        clubDynamic.setUpdateTime(new Date());
//        ClubDynamic result = clubDynamicDao.save(clubDynamic);
//
//        if(result == null){
//            return BentlyResponse.fail("数据保存出错");
//        }else{
//            return BentlyResponse.success(result);
//        }
//
//    }
//
//    @RequestMapping("/get/activityList")
//    public BentlyResponse getActivityList(){
//        List<UserActivity> list = Lists.newArrayList();
//        Iterator<UserActivity> iterable = userActivityDao.findAll().iterator();
//        while(iterable.hasNext()){
//            list.add(iterable.next());
//        }
//        return BentlyResponse.success(list);
//    }
//
//    @RequestMapping("/update/clubActivity")
//    public BentlyResponse updateUserActivity(@RequestBody UserActivity userActivity){
//        userActivity.setHandleuser("yong.zou");
//        userActivity.setUpdateTime(new Date());
//        UserActivity result = userActivityDao.save(userActivity);
//        if(result == null){
//            return BentlyResponse.fail("保存数据异常，请稍后重试！");
//        }else{
//            return BentlyResponse.success(result);
//        }
//
//    }
//
//    @RequestMapping("/get/clubActivity")
//    public BentlyResponse getUserActivity(long id){
//        UserActivity result = userActivityDao.findOne(id);
//        if(result == null){
//            return BentlyResponse.fail("数据查询异常，请稍后重试！");
//        }else{
//            return BentlyResponse.success(result);
//        }
//    }
//
//    @RequestMapping("/save/clubActivity")
//    public BentlyResponse saveClubDynamic(@RequestBody UserActivity userActivity){
//
//        userActivity.setHandleuser("yong.zou");
//        userActivity.setUpdateTime(new Date());
//        UserActivity result = userActivityDao.save(userActivity);
//        if(result == null){
//            return BentlyResponse.fail("数据保存出错");
//        }else{
//            return BentlyResponse.success(result);
//        }
//
//    }


}
