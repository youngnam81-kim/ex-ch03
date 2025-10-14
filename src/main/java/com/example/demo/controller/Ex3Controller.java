package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ExCh03Application;
import com.example.demo.service.Ex3Service;

@RestController
public class Ex3Controller {

    Ex3Service exService;
	public Ex3Controller(Ex3Service exService, ExCh03Application exCh03Application) {
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
	
	@GetMapping("/ex331")
	public List<?> ex331() {
		// http://localhost:8080/ex331
		return exService.ex331();
	}
	
	@GetMapping("/ex332")
	public StringBuilder ex332() {
		// http://localhost:8080/ex332
		return exService.ex332();
	}
	
	@GetMapping("/ex333")
	public String ex333() {
		// http://localhost:8080/ex333
		return exService.ex333();
	}
	
	@GetMapping("/ex334")
	public StringBuilder ex334() {
		// http://localhost:8080/ex334
		return exService.ex334();
	}
	
	@GetMapping("/ex335")
	public StringBuilder ex335() {
		// http://localhost:8080/ex335
		return exService.ex335();
	}
	
	@GetMapping("/ex337")
	public String ex337() {
		// http://localhost:8080/ex337
		return exService.ex337();
	}
	
	@GetMapping("/ex338")
	public String ex338() {
		// http://localhost:8080/ex338
		return exService.ex338();
	}
	
	@GetMapping("/ex3310")
	public String ex3310() {
		// http://localhost:8080/ex3310
		return exService.ex3310();
	}
	
	@GetMapping("/ex3311")
	public String ex3311() {
		// http://localhost:8080/ex3311
		return exService.ex3311();
	}
	
	@GetMapping("/ex3312")
	public StringBuilder ex3312() {
		// http://localhost:8080/ex3312
		return exService.ex3312();
	}
	
	@GetMapping("/ex3313")
	public StringBuilder ex3313() {
		// http://localhost:8080/ex3313
		return exService.ex3313();
	}
	
	@GetMapping("/ex3314")
	public StringBuilder ex3314() {
		// http://localhost:8080/ex3314
		return exService.ex3314();
	}
	
}
