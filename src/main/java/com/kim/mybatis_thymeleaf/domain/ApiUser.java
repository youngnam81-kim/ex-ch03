package com.kim.mybatis_thymeleaf.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiUser {
	private Integer id;
	private String userId;
	private String userName;
}
