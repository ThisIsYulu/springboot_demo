package com.yulu.wang.controller;

import com.yulu.wang.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Yulu on 2018/11/23.
 */
@RestController
@RequestMapping("/freemarker")
public class FreeMarkerController {

    @GetMapping("showuser")
    public ModelAndView showUserInfo(@RequestParam(value = "id", required = true) Long id) {
        ModelAndView view = new ModelAndView();
        User user = new User();
        user.setId(id);
        user.setName("yulu");
        view.addObject("user", user);
        view.setViewName("userInfo");
        return view;
    }
}
