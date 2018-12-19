package com.ujiuye.controller;

import com.ujiuye.bean.Mobile;
import com.ujiuye.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @RequestMapping("/getMobile")
    public String getMobile(String num, Model model) {

        Mobile mobile = mobileService.getMobile(num);
        System.out.println(mobile);
        String msg = "";
        if (mobile != null) {

            msg = "号码:" + num + " 归属地:" + mobile.getMarea() + " 所属运营商:" + mobile.getMtype();

        } else {
            msg = "号码:" + num + "在号段库不存在!";
        }

        model.addAttribute("msg", msg);
        return "result";
    }

}
