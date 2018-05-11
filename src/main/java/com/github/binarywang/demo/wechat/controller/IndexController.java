package com.github.binarywang.demo.wechat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linzefeng on 2018-05-11
 */
@RestController
public class IndexController {
    @RequestMapping("/index")
    String login() {
        return "index.html";
    }
}
