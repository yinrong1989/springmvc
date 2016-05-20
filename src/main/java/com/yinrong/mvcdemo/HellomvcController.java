package com.yinrong.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yinrong on 2016/4/29.
 */
@Controller

public class HellomvcController {
    @RequestMapping("/hello")
    public  String HelloMvc(){
       System.out.println("home");
       return "home";
   }
    @RequestMapping("/hello2")
    public @ResponseBody Map hello2() {
        Map map=new HashMap();
        map.put("name","yinrong");
        return map;
    }
}
