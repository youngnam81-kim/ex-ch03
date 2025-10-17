package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

	@GetMapping("/article")
	public String createArticle(@RequestParam(value ="title", defaultValue = "타이틀 입니다.") String title, @RequestParam(value = "content", defaultValue = "콘텐츠 입니다.") String content){
		return title+"<br><strong>"+content;
	}
}
