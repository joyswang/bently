package com.spring.bently.wx.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wgq on 16-4-11.
 */
@Controller
@RequestMapping("/wx/member/recharge")
public class RechargeController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String recharge() {
        return "member/recharge" ;
    }
}
