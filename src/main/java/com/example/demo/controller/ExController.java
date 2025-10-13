package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExService;


@RestController
public class ExController {

	ExService exService;
	public ExController(ExService exService) {
		this.exService = exService;
	}
	
	@GetMapping("/")
	public String getMethodName() {
		// http://localhost:8080/
		return new String("Root 메인 화면");
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		// http://localhost:8080/sayHello
		return exService.sayHello();
	}
	
	@GetMapping("/ex321")
	public String ex321(@RequestParam("no") int number) {
		// http://localhost:8080/ex321?no=
		return exService.ex321(number);
    }
	
	@GetMapping("/ex322")
	public String[] ex322() {
		// http://localhost:8080/ex322
		return exService.ex322();
    }
	
	@GetMapping("/ex323")
	public String ex323() {
		// http://localhost:8080/ex323
		return exService.ex323();
    }
	
	@GetMapping("/ex324")
	public String ex324() {
		// http://localhost:8080/ex324
		return exService.ex324();
    }
	
	@GetMapping("/ex325")
	public String ex325(@RequestParam("no") int number){
		// http://localhost:8080/ex325?no=
		return exService.ex325(number);
	}
	
	@GetMapping("/ex326")
	public String ex326(){
		// http://localhost:8080/ex326
		return exService.ex326();
	}
	
	@GetMapping("/ex327")
	public String ex327(){
		// http://localhost:8080/ex327
		return exService.ex327();
	}
	
}
