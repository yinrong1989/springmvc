package com.yinrong.util.cache.impl;
import com.yinrong.model.Constant;
import com.yinrong.redis.RedisClientTemplate;
import  com.yinrong.util.SpringContextHolder;
import com.yinrong.util.cache.RedisCache;
import org.springframework.context.ApplicationContext;

import java.util.Map;
import java.util.Set;

/**
 * Created by yinrong on 2016/11/14.
 */
public enum  RedisCacheByHash implements RedisCache {
    SINGLETON;
   private Map<String,String> cacheMap;

  private   RedisClientTemplate redisClient;

        RedisCacheByHash() {
        ApplicationContext applicationContext=SpringContextHolder.getApplicationContext();
         redisClient = (RedisClientTemplate)applicationContext.getBean(Constant.Cache);
         init();
    }
    public   void init(){
        refreshAll2Map();
    }
    public Set<String> getAllCacheKeys(){
      return  redisClient.hkeys(Constant.Cache);
    }

    public  void refresh2Map(String key){
        String value=  redisClient.hget(Constant.Cache,key);
        cacheMap.put(key,value);
    }
    public  void refresh2Redis(String key,String value){
        cacheMap.put(key,value);
    }
    public void refreshAll2Redis(){
        for (String key:cacheMap.keySet()){
            redisClient.hset("cache",key,cacheMap.get(key));
        }
    }
    public  void refreshAll2Map(){
        Set<String> keys=redisClient.hkeys(Constant.Cache);
        for (String key : keys) {
          String value=  redisClient.hget(Constant.Cache,key);
            cacheMap.put(key,value);
        }
    }
}
