package com.github.binarywang.demo.wechat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by linzefeng on 2018-05-18
 */
public class JsSdkController {
    //jssdk
    @RequestMapping(value = "/jssdk", method = RequestMethod.GET)
    public String jssdk() {
        System.out.println("jssdk");
        //String temp = XMGHttpUtil.get(WeixinUtil.GET_TICKET_URL.replace("ACCESS_TOKEN", WeixinUtil.getAccessToken()));
        //System.out.println(temp);
        return "jssdk";
    }

}
