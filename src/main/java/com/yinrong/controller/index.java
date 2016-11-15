package com.yinrong.controller;

import com.yinrong.dataobject.MemberDo;
import com.yinrong.model.User;
import com.yinrong.redis.RedisClientTemplate;
import com.yinrong.service.MemberService;
import com.yinrong.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yinrong on 2016/5/2.
 */
@Controller

public class index {
    @Resource
    MemberService memberService;
    @Resource
    RedisClientTemplate redisClientTemplate;
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public String index(){
        MemberDo  memberDo=memberService.queryLastCreate();
        System.out.println(memberDo.getMemberName());
        System.out.println(memberDo.getCreateTime());

        redisClientTemplate.set("a", "abc");
        System.out.println(redisClientTemplate.get("a"));
        return "index";
    }
    @RequestMapping("/index2")
    public ModelAndView index2(){
        List<User>users= userService.getUserlist();


        return new ModelAndView("showAlluser","userList",users);
    }
}
