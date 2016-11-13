package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yongyeon on 2016-08-15.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        model.addAttribute("name", "krrrrrrr");
        return "hello.tiles";
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("name", "krrrrrrr");
        return "hello.tiles";
    }

    @RequestMapping(value = "/login.do")
    public String login(Model model) {
        return "login";
    }

}
