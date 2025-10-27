package com.kim.mybatis_thymeleaf.domain;

import java.time.LocalDate;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Student {
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDate createdAt;
	private LocalDate updatedAt;
}
