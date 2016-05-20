package com.yinrong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yinrong on 2016/5/2.
 */
@Controller

public class index {
@RequestMapping("/index")
    public String index(){
        return "index";
    }
}
