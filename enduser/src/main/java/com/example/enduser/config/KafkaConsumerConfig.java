package com.example.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {
	

	@KafkaListener(topics = "location-update-topic", groupId = "group-1")
	public void updateLocation(String value) {
		System.out.println(value);
	}
}
