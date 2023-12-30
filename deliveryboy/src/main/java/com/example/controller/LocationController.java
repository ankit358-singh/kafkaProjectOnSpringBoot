package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private KafkaService kafkaServ;
	
	@PostMapping("/updateLocation")
	public ResponseEntity<?> updateLocation(){
		this.kafkaServ.updateLocation("(" + Math.random() + "_Key" + "," + Math.random() + ")");
		return new ResponseEntity<>(Map.of("message", "location Updated"), HttpStatus.OK);
	}
}
