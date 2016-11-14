package com.yinrong.util.cache;

import com.yinrong.model.Constant;

import java.util.Set;

/**
 * Created by yinrong on 2016/11/14.
 */
public interface RedisCache {
    public  void init();
    public Set<String> getAllCacheKeys();

    public  void refresh2Map(String key);
    public  void refresh2Redis(String key,String value);
    public void refreshAll2Redis();
    public  void refreshAll2Map();

}
