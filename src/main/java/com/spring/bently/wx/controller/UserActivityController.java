package com.spring.bently.wx.controller;

import com.spring.bently.manager.dao.UserActivityDao;
import com.spring.bently.manager.model.UserActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wgq on 16-4-10.
 */
@Controller
@RequestMapping("/wx/user/activity")
public class UserActivityController {

    @Autowired
    private UserActivityDao userActivityDao ;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewDetail(@RequestParam Long id,Model model) {

        UserActivity userActivity = userActivityDao.findOne(id) ;

        model.addAttribute("title",userActivity.getTitle()) ;
        //model.addAttribute("context", userActivity.)
        return null ;
    }
}
