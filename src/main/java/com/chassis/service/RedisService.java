package com.chassis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, String> template;

    public String get(String key) {
        return template.boundValueOps(key).get();
    }

    public void put(String key, String value) {
        template.boundValueOps(key).set(value);
    }
}
