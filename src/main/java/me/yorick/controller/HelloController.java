package me.yorick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.inject.spi.Message;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private RedisProperties redisPropertries;
	
	@GetMapping("/")
	public Message hello() {
		return new Message("hello, redis is at "+redisPropertries.getUrl());
	}
}
