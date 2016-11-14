package com.yinrong.util.cache.impl;

import com.yinrong.model.Constant;
import com.yinrong.redis.RedisClientTemplate;
import com.yinrong.util.SpringContextHolder;
import com.yinrong.util.cache.RedisCache;
import org.springframework.context.ApplicationContext;

import java.util.Map;
import java.util.Set;

/**
 * Created by yinrong on 2016/11/14.
 */
public enum RedisCacheByKey implements RedisCache {
    SINGLETON;
    private Map<String,String> cacheMap;

    private   RedisClientTemplate redisClient;

    public void init() {
        refreshAll2Map();
    }
        RedisCacheByKey() {
            ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();
            redisClient = (RedisClientTemplate) applicationContext.getBean(Constant.Cache);
            init();
        }

    public Set<String> getAllCacheKeys() {
        return  null;
    }

    public void refresh2Map(String key) {

    }

    public void refresh2Redis(String key, String value) {
        redisClient.set(key,cacheMap.get(key));
    }

    public void refreshAll2Redis() {
        for (String key:cacheMap.keySet()){
            redisClient.set(key,cacheMap.get(key));
        }
    }

    public void refreshAll2Map() {

    }
}
