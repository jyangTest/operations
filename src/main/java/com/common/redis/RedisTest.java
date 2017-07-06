package com.common.redis;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisTest {
	
	
	 public static void main(String[] args) {
	        ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath*:/spring-redis.xml");
	        RedisClientTemplate redisClient = (RedisClientTemplate)ac.getBean("redisClientTemplate");
	        redisClient.set("a", "abc");
	        System.out.println(redisClient.get("a"));
	 }
}
