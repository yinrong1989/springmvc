package com.yinrong.controller;

import com.yinrong.dataobject.MemberDo;
import com.yinrong.redis.RedisClientTemplate;
import com.yinrong.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by yinrong on 2016/5/2.
 */
@Controller

public class index {
    @Resource
    MemberService memberService;
    @Resource
    RedisClientTemplate redisClientTemplate;
    @RequestMapping("/index")
    public String index(){
        MemberDo  memberDo=memberService.queryLastCreate();
        System.out.println(memberDo.getMemberName());
        System.out.println(memberDo.getCreateTime());

        redisClientTemplate.set("a", "abc");
        System.out.println(redisClientTemplate.get("a"));
        return "index";
    }
}
