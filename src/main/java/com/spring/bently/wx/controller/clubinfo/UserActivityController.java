package com.spring.bently.wx.controller.clubinfo;

import com.spring.bently.manager.dao.UserActivityDao;
import com.spring.bently.manager.model.UserActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wgq on 16-4-10.
 */
@Controller
@RequestMapping("/wx/user/activity")
public class UserActivityController {

    @Autowired
    private UserActivityDao userActivityDao ;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String view(Model model) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(0,5,sort) ;
        Page<UserActivity> page = userActivityDao.findAll(pageable) ;
        List<UserActivity> list = new ArrayList<UserActivity>() ;
        for(Iterator itr = page.iterator();itr.hasNext();) {
            UserActivity userActivity = (UserActivity)itr.next() ;
            list.add(userActivity);
        }
        model.addAttribute("ualist",list) ;
        return "clubinfo/useractivity" ;
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String viewDetail(@RequestParam Long id,Model model) {

        UserActivity userActivity = userActivityDao.findOne(id) ;

        model.addAttribute("title",userActivity.getTitle()) ;
        model.addAttribute("context", userActivity.getContext()) ;
        return "clubinfo/useractivitydetail" ;
    }
}
