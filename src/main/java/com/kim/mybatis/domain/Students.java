package com.kim.mybatis.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Students {

	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

}
