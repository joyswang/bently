package com.spring.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wgq on 16-4-2.
 */
@RestController
public class EntranceController {

    @RequestMapping(value = "/entrance", method = RequestMethod.GET)
    public String entranceGet() {

        return "111111" ;
    }

    @RequestMapping(value = "/entrance", method = RequestMethod.POST)
    public String entrancePost() {

        return this.entranceGet() ;
    }
}
