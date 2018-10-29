package com.zzl.util;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
@Repository("redisCache")
public class RedisCache {

    @Resource
    private JedisPool jedisPool1;

    /**
     * 设置数据到Redis
     *
     */
    public void setDataToRedis(String key,String value){
        //先获得池中的jedis对象
        Jedis jedis = jedisPool1.getResource();
        jedis.set(key,value);

    }
    /**
     * 获取redis中的数据
     */
    public String getDataFromRedis(String key){
        Jedis jedis = jedisPool1.getResource();
        return jedis.get(key);

    }
}
