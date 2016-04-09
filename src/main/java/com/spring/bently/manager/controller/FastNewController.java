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

import com.spring.bently.manager.db.model.Clubprofile;
import com.spring.bently.manager.pagedata.BentlyResponse;
import com.spring.bently.manager.service.fastnew.FastNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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
    private FastNewService fastNewService;

    @RequestMapping("/summary")
    public BentlyResponse getSummary(){
        Clubprofile clubprofile = fastNewService.queryClubprofile();
        if(clubprofile == null ){
            return BentlyResponse.fail("数据异常，请稍后重试！");
        }else{
            return BentlyResponse.success(clubprofile);
        }
    }

    @RequestMapping("/updateSummary")
    public BentlyResponse<Clubprofile> updateSummary(){
        Clubprofile clubprofile = new Clubprofile();
        clubprofile.setContext("12222");
        clubprofile.setUpdatetime(new Date());
        clubprofile.setUsername("yong.zou");
        BentlyResponse<Clubprofile> response = BentlyResponse.success(clubprofile);

        return response;
    }

    @RequestMapping("/addSummary")
    public BentlyResponse addSummary(){
        Clubprofile clubprofile = new Clubprofile();
        clubprofile.setContext("12222");
        clubprofile.setUpdatetime(new Date());
        clubprofile.setUsername("yong.zou");

        boolean reuslt = fastNewService.addClubprofile(clubprofile);
        if(reuslt){
            return BentlyResponse.success("success");
        }else{
            return BentlyResponse.fail("添加失败");
        }
    }

    @RequestMapping("/dynamic")
    public String getDynamic(){
        return "";
    }

    @RequestMapping("/activity")
    public String getActivity(){
        return "";
    }







}
