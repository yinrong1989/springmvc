package com.yinrong.redis;

import redis.clients.jedis.ShardedJedis;

/**
 * Created by yinrong on 2016/11/14.
 */
public interface RedisDataSource {
    /**
     * 取得redis的客户端，可以执行命令了。
     * */
    public abstract ShardedJedis getRedisClient();
    /**
     * 将资源返还给pool
     * */
    public void returnResource(ShardedJedis shardedJedis);
    /**
     * 取得redis的客户端，可以执行命令了。
     * */
    public void returnResource(ShardedJedis shardedJedis,boolean broken);
}
