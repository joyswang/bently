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
public class MemberCenterController {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private WashCarDao washCarDao;

    @Autowired
    private WaxingDao waxingDao;

    @Autowired
    private MaintenanceDao maintenanceDao;

    @Autowired
    private RescueDao rescueDao;



    @RequestMapping("/get/washCarList")
    public BentlyResponse getHotelList(){
        List<WashCar> list = Lists.newArrayList();
        Iterator<WashCar> iterable = washCarDao.findAll().iterator();
        while(iterable.hasNext()){
            list.add(iterable.next());
        }
        return BentlyResponse.success(list);
    }

    @RequestMapping("/handle/washCar")
    public BentlyResponse handleHotel(String wechatid){

        WashCar washCar = washCarDao.findBywechatid(wechatid);
        Member member = memberDao.findByWechatid(wechatid);
        if(member == null){
            return BentlyResponse.fail("会员不存在!");
        }
        int num = member.getWashcarnum();
        if(num<=0){
            return BentlyResponse.fail("剩余洗车次数为0,不能操作!");
        }
        member.setWashcarnum(num-1);
        Member memberResult = memberDao.save(member);
        if(memberResult == null){
            return BentlyResponse.fail("保存洗车次数失败!");
        }

        washCar.setIsHandle(true);
        washCar.setHandleuser("bentley");
        washCar.setUpdateTime(new Date());
        WashCar result = washCarDao.save(washCar);
        if(result == null){
            return BentlyResponse.fail("更新洗车数据失败，请稍后重试！");
        }else{
            return BentlyResponse.success(result);
        }

    }



    @RequestMapping("/get/waxingList")
    public BentlyResponse getWaxingList(){
        List<Waxing> list = Lists.newArrayList();
        Iterator<Waxing> iterable = waxingDao.findAll().iterator();
        while(iterable.hasNext()){
            list.add(iterable.next());
        }
        return BentlyResponse.success(list);
    }

    @RequestMapping("/handle/waxing")
    public BentlyResponse handleWaxing(String wechatid){

        Waxing waxing = waxingDao.findBywechatid(wechatid);
        Member member = memberDao.findByWechatid(wechatid);
        if(member == null){
            return BentlyResponse.fail("会员不存在!");
        }
        int num = member.getWashcarnum();
        if(num<=0){
            return BentlyResponse.fail("剩余打蜡次数为0,不能操作!");
        }
        member.setWashcarnum(num-1);
        Member memberResult = memberDao.save(member);
        if(memberResult == null){
            return BentlyResponse.fail("保存打蜡次数失败!");
        }

        waxing.setIsHandle(true);
        waxing.setHandleuser("bentley");
        waxing.setUpdateTime(new Date());
        Waxing result = waxingDao.save(waxing);
        if(result == null){
            return BentlyResponse.fail("更新打蜡数据失败，请稍后重试！");
        }else{
            return BentlyResponse.success(result);
        }

    }


    @RequestMapping("/get/maintenanceList")
    public BentlyResponse getMaintenanceList(){
        List<Maintenance> list = Lists.newArrayList();
        Iterator<Maintenance> iterable = maintenanceDao.findAll().iterator();
        while(iterable.hasNext()){
            list.add(iterable.next());
        }
        return BentlyResponse.success(list);
    }

    @RequestMapping("/handle/maintenance")
    public BentlyResponse handleMaintenance(String wechatid){

        Maintenance maintenance = maintenanceDao.findBywechatid(wechatid);
        Member member = memberDao.findByWechatid(wechatid);
        if(member == null){
            return BentlyResponse.fail("会员不存在!");
        }
        int num = member.getWashcarnum();
        if(num<=0){
            return BentlyResponse.fail("剩余保养次数为0,不能操作!");
        }
        member.setWashcarnum(num-1);
        Member memberResult = memberDao.save(member);
        if(memberResult == null){
            return BentlyResponse.fail("保存保养次数失败!");
        }

        maintenance.setIsHandle(true);
        maintenance.setHandleuser("bentley");
        maintenance.setUpdateTime(new Date());
        Maintenance result = maintenanceDao.save(maintenance);
        if(result == null){
            return BentlyResponse.fail("更新保养数据失败，请稍后重试！");
        }else{
            return BentlyResponse.success(result);
        }

    }


    @RequestMapping("/get/rescueList")
    public BentlyResponse getRescueList(){
        List<Rescue> list = Lists.newArrayList();
        Iterator<Rescue> iterable = rescueDao.findAll().iterator();
        while(iterable.hasNext()){
            list.add(iterable.next());
        }
        return BentlyResponse.success(list);
    }

    @RequestMapping("/handle/rescue")
    public BentlyResponse handleRescue(String wechatid){

        Rescue rescue = rescueDao.findBywechatid(wechatid);
        Member member = memberDao.findByWechatid(wechatid);
        if(member == null){
            return BentlyResponse.fail("会员不存在!");
        }
        int num = member.getWashcarnum();
        if(num<=0){
            return BentlyResponse.fail("剩余市内救援次数为0,不能操作!");
        }
        member.setWashcarnum(num-1);
        Member memberResult = memberDao.save(member);
        if(memberResult == null){
            return BentlyResponse.fail("保存市内救援次数失败!");
        }

        rescue.setIsHandle(true);
        rescue.setHandleuser("bentley");
        rescue.setUpdateTime(new Date());
        Rescue result = rescueDao.save(rescue);
        if(result == null){
            return BentlyResponse.fail("更新市内救援数据失败，请稍后重试！");
        }else{
            return BentlyResponse.success(result);
        }

    }


}
