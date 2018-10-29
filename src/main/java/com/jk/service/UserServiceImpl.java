package com.jk.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;


public class UserServiceImpl implements UserService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;




    @Override
    public void getUserInfo() {
        System.out.println("username=admin");
    }

    @Override
    public void testUuid(String uuid) {
        amqpTemplate.convertAndSend("666",uuid);

    }
}
