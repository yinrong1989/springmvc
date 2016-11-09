package com.yinrong.controller;

import com.yinrong.dataobject.MemberDo;
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
    @RequestMapping("/index")
    public String index(){
        MemberDo  memberDo=memberService.queryLastCreate();
        System.out.println(memberDo.getMemberName());
        System.out.println(memberDo.getCreateTime());
        return "index";
    }
}
