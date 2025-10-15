package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CalPostRequest;
import com.example.demo.dto.CalResponse;
import com.example.demo.service.CalService;

@RestController
@RequestMapping("/calculator")
public class CalController {

	// CalService calService = new CalService(); //1. new 로 생성
	// @Autowired //2. @Autowired 사용.
	CalService calService;

	// 3. 생성자 사용.
	public CalController(CalService calService) {
		this.calService = calService;
	}
	
	@PostMapping("/postCalculator")
	private CalResponse postCalculator(@RequestBody CalPostRequest request) throws Exception {
		String result = calService.calculate(request.getNumber1(), request.getNumber2(), request.getOperator());
		
		return new CalResponse(request.getNumber1(), request.getNumber2(), request.getOperator(), result);
		
	}
/*
	@GetMapping("/add")
	public String getAdd(@RequestParam(value = "number2", defaultValue = "45.8") String number1,
			@RequestParam(value = "number1", defaultValue = "155.78") String number2) {
		// return "덧셈";
		return calService.add(number1, number2);
	}
*/
	@GetMapping("/add")
	public CalResponse getAdd(@RequestParam(value = "number2", defaultValue = "45.8") String number1,
			@RequestParam(value = "number1", defaultValue = "155.78") String number2) {
		// return "덧셈";
		// return calService.add(number1, number2);
		String result = calService.add(number1, number2);
		return new CalResponse(number1, number2, "ADD", result);
	}
	
	@GetMapping("/subtract")
	public CalResponse getSubtract(@RequestParam(value = "number2", defaultValue = "45.8") String number1,
			@RequestParam(value = "number1", defaultValue = "155.78") String number2) {
		// return "뺄셈";
		// return calService.subtract(number1, number2);
		
		String result = calService.subtract(number1, number2);
		return new CalResponse(number1, number2, "SUBTRACT", result);
	}

	@GetMapping("/multiply")
	public CalResponse getMultiply(@RequestParam(value = "number2", defaultValue = "45.8") String number1,
			@RequestParam(value = "number1", defaultValue = "155.78") String number2) {
		// return "곱셈";
		// return calService.multiply(number1, number2);
		
		String result = calService.multiply(number1, number2);
		return new CalResponse(number1, number2, "MULTIPLY", result);
	}

	@GetMapping("/divide")
	public CalResponse getDivide(@RequestParam(value = "number2", defaultValue = "45.8") String number1,
			@RequestParam(value = "number1", defaultValue = "155.78") String number2) throws Exception {
		// return "나눗셈";
		// return calService.divide(number1, number2);
		
		String result = calService.divide(number1, number2);
		return new CalResponse(number1, number2, "DIVIDE", result);
	}
}
