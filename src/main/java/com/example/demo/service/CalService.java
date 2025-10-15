package com.example.demo.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class CalService {

	public String calculate(String number1, String number2, String operator) throws Exception {
		String returnMsg = null;
		if(operator.equals("ADD")) {
			returnMsg = add(number1, number2);	
		}else if(operator.equals("SUBTRACT")) {
			returnMsg = subtract(number1, number2);
		}else if(operator.equals("MULTIPLY")) {
			returnMsg = multiply(number1, number2);
		}else if(operator.equals("DIVIDE")) {
			returnMsg = divide(number1, number2);
		}

		return returnMsg;
	}
	
	public String add(String number1, String number2) {
		Double returnMsg = Double.parseDouble(number1) + Double.parseDouble(number2);
		DecimalFormat df = new DecimalFormat("#.##");

//		return "더하기 : " + number1 + " + " + number2 + " = " + df.format(returnMsg).toString();
		return df.format(returnMsg).toString();
	}

	public String subtract(String number1, String number2) {
		Double returnMsg = Double.parseDouble(number1) - Double.parseDouble(number2);
		DecimalFormat df = new DecimalFormat("#.##");

//		return "빼기 : " + number1 + " - " + number2 + " = " + df.format(returnMsg).toString();
		return df.format(returnMsg).toString();
	}

	public String multiply(String number1, String number2) {
		Double returnMsg = Double.parseDouble(number1) * Double.parseDouble(number2);
		DecimalFormat df = new DecimalFormat("#.##");

//		return "곱하기 : " + number1 + " * " + number2 + " = " + df.format(returnMsg).toString();
		return df.format(returnMsg).toString();
	}

	public String divide(String number1, String number2) throws Exception {
		Double returnMsg = Double.parseDouble(number1) / Double.parseDouble(number2);
		DecimalFormat df = new DecimalFormat("#.##");

		if (number2.equals("0")) {
	        throw new ArithmeticException("0으로 나눌수 없습니다.");
	    }
		
//		return "나누기 : " + number1 + " / " + number2 + " = " + df.format(returnMsg).toString();
		return df.format(returnMsg).toString();
	}

}
