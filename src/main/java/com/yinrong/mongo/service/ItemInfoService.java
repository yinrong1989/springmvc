package com.yinrong.mongo.service;

import com.alibaba.fastjson.JSONObject;
import com.yinrong.mongo.dbModel.ItemInfo;

import java.util.List;

/**
 * Created by yinrong on 2016/11/16.
 */
public interface ItemInfoService {
    // 查询
    public List<ItemInfo> getItemInfo(JSONObject json) throws Exception;

    // 保存
    public int save(ItemInfo itemInfo) throws Exception;

    // 更新
    public void update(ItemInfo intemInfo) throws Exception;
}
