package com.spring.bently.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wgq on 16-4-10.
 */
@Controller
@RequestMapping("/wx/club/summary")
public class ClubSummaryController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewDetail() {


        return "" ;
    }
}
