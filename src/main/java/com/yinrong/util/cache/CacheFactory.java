package com.yinrong.util.cache;

import com.yinrong.model.Constant;
import com.yinrong.util.cache.impl.RedisCacheByHash;
import com.yinrong.util.cache.impl.RedisCacheByKey;

/**
 * Created by yinrong on 2016/11/14.
 */
public class CacheFactory {

    public RedisCache getRedisCache(String redisCache ){
        if (redisCache==null||Constant.RedisCacheByHash.equals(redisCache)){
            return RedisCacheByHash.SINGLETON;
        }else{
            return RedisCacheByKey.SINGLETON;
        }
    }
}
