package com.yinrong.dao;

import com.yinrong.dataobject.MemberDo;

import java.util.List;

/**
 * Created by yinrong on 2016/11/9.
 */
public interface MemberDao {
    int insert(MemberDo id);
     MemberDo selectLastCreate();
}
