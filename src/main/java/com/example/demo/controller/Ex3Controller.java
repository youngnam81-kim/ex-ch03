package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.ExCh03Application;
import com.example.demo.service.Ex3Service;


@RestController
public class Ex3Controller {

    private final ExCh03Application exCh03Application;

	Ex3Service exService;
	public Ex3Controller(Ex3Service exService, ExCh03Application exCh03Application) {
		this.exService = exService;
		this.exCh03Application = exCh03Application;
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
		return exService.ex331();
	}
	
	@GetMapping("/ex332")
	public StringBuilder ex332() {
		return exService.ex332();
	}
	
	@GetMapping("/ex333")
	public String ex333() {
		return exService.ex333();
	}
	
	@GetMapping("/ex334")
	public StringBuilder ex334() {
		return exService.ex334();
	}
	
	@GetMapping("/ex335")
	public StringBuilder ex335() {
		return exService.ex335();
	}
	
	
	
	
	
	
}
