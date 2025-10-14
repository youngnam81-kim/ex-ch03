package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ExCh03Application;
import com.example.demo.service.Ex3Service;
import com.example.demo.service.Ex5Service;

@RestController
public class Ex5Controller {

	Ex5Service exService;
	public Ex5Controller(Ex5Service exService, ExCh03Application exCh03Application) {
		this.exService = exService;
	}
	
	@GetMapping("/ex521")
	public String ex521() {
		// http://localhost:8080/ex521
		exService.ex521();
		return "Hello <strong>Backend</strong>";
	}
}
