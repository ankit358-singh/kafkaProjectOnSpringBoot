package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private Logger log = LoggerFactory.getLogger(KafkaService.class);
	
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send("location-update-topic",location);
		this.log.info("producer working");
		return true;
	}
	
	public void setLocation() {
		this.log.debug(this.kafkaTemplate.toString());
	}
}
