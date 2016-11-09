package com.yinrong.service.impl;

import com.yinrong.dao.MemberDao;
import com.yinrong.dataobject.MemberDo;
import com.yinrong.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by yinrong on 2016/11/9.
 */
//1 让checked例外也回滚：在整个方法前加上 @Transactional(rollbackFor=Exception.class)
//
//2 让unchecked例外不回滚： @Transactional(notRollbackFor=RunTimeException.class)
//
//3 不需要事务管理的(只查询的)方法：@Transactional(propagation=Propagation.NOT_SUPPORTED)
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberDao memberDao;
    @Transactional

    public MemberDo queryLastCreate() {
        return memberDao.selectLastCreate();
    }
}
