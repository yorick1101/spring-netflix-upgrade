package me.yorick.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.inject.spi.Message;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Value("${lock.redis.host}")
	private String lockRedisHost;
	
	@Value("${spring.cloud.bootstrap.enabled}")
	private String bootstrap;
	
	@GetMapping("/")
	public Message hello() {
		return new Message("hello, lock redis is at "+lockRedisHost+";bootstrap:"+bootstrap);
	}
}
