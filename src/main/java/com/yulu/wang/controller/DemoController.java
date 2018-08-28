package com.yulu.wang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yulu on 2018/8/28.
 */
@RestController
public class DemoController {

    @RequestMapping("/test222")
    public String test() {
        return "yulu";
    }
}
