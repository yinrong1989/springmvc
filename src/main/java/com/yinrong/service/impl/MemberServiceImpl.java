package com.yinrong.service.impl;

import com.yinrong.dao.MemberDao;
import com.yinrong.dataobject.MemberDo;
import com.yinrong.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yinrong on 2016/11/9.
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberDao memberDao;
    public MemberDo queryLastCreate() {
        return memberDao.selectLastCreate();
    }
}
