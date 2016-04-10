package com.spring.bently.wx.controller;

import com.spring.bently.manager.dao.ClubDynamicDao;
import com.spring.bently.manager.model.ClubDynamic;
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
@RequestMapping("/wx/club/dynamic")
public class ClubDynamicController {

    @Autowired
    private ClubDynamicDao clubDynamicDao ;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewDetail(@RequestParam Long id,Model model) {

        ClubDynamic clubDynamic = clubDynamicDao.findOne(id) ;

        model.addAttribute("title", clubDynamic.getTitle()) ;
        model.addAttribute("context", clubDynamic.getContext()) ;
        return "clubdynamic" ;
    }
}
