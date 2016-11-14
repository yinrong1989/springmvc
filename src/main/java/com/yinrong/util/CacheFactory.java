package com.yinrong.util;
import com.yinrong.model.Constant;
import com.yinrong.redis.RedisClientTemplate;
import  com.yinrong.util.SpringContextHolder;
import org.springframework.context.ApplicationContext;

import java.util.Map;
import java.util.Set;

/**
 * Created by yinrong on 2016/11/14.
 */
public enum  CacheFactory {
   SIGLEGTON;
   private Map<String,String> cacheMap;

  private   RedisClientTemplate redisClient;

    CacheFactory() {
        ApplicationContext applicationContext=SpringContextHolder.getApplicationContext();
         redisClient = (RedisClientTemplate)applicationContext.getBean(Constant.Cache);
    }
    private  void init(){

    }
    private Set<String> getAllCacheKeys(){
      return  redisClient.hkeys(Constant.Cache);
    }

    private  void refresh2Map(String key){
        String value=  redisClient.hget(Constant.Cache,key);
        cacheMap.put(key,value);
    }
    private  void refresh2Redis(String key,String value){
        cacheMap.put(key,value);
    }
    private void refreshAll2Redis(){
        for (String key:cacheMap.keySet()){
            redisClient.hset("cache",key,cacheMap.get(key));
        }
    }
    private  void refreshAll2Map(){
        Set<String> keys=redisClient.hkeys(Constant.Cache);
        for (String key : keys) {
          String value=  redisClient.hget(Constant.Cache,key);
            cacheMap.put(key,value);
        }
    }
}
