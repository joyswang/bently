/*
 * Create Author  : yong.zou
 * Create Date    : 2016-04-09
 * Project        : bently
 * File Name      : IndexController.java
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */
package com.spring.bently.manager.controller;

import com.spring.bently.manager.dao.UserDao;
import com.spring.bently.manager.model.User;
import com.spring.bently.manager.pagedata.BentlyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * 功能描述:  <p>
 *
 * @author : yong.zou <p>
 * @version 1.0 2016-04-09
 * @since bently 1.0
 */
@RestController
public class IndexController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/home")
    public BentlyResponse indexHome(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookieArray = request.getCookies();
        String userName = "";
        for(Cookie cookie : cookieArray){
            String cookieName = cookie.getName();
            String cookieValue = cookie.getValue();
            if("userName".equals(cookieName)){
                userName = cookieValue;
            }
        }

        if("".equals(userName)){
            return  BentlyResponse.fail("用户未登入");
        }

        User user = userDao.findByName(userName);

        if(user == null){
            return  BentlyResponse.fail("用户未登入");
        }
        user.setPassowrd("");
        return BentlyResponse.success(user);
    }

    @RequestMapping("/login")
    public BentlyResponse login(@RequestBody User user,HttpServletRequest request,HttpServletResponse response){

        User result = userDao.findByNameAndPassword(user.getName(),user.getPassowrd());

        if(result == null){
            return BentlyResponse.fail("用户名或密码错误");
        }

        Cookie cookie  = new Cookie("userName",result.getName());
        response.addCookie(cookie);
        return BentlyResponse.success("登入成功");


    }



}
