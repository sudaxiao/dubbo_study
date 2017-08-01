package com.dfire.config;

import com.twodfire.redis.ICacheService;
import com.twodfire.redis.RedisSentinelService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ch on 2017/7/29.
 */
@Configuration
public class RedisBean {

    @ConfigurationProperties(prefix = "redis.set")
    @Bean(initMethod = "init")
    public ICacheService sessionCacheService() {
        RedisSentinelService sentinelService = new RedisSentinelService();
        return sentinelService;
    }
}
