package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Ex5Service {
	Logger log = LoggerFactory.getLogger(Ex3Service.class);
	
	public String ex521() {
		System.out.println("sayHello");
		return "ex521";
	}
}
