package com.kim.mybatis_thymeleaf.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kim.mybatis_thymeleaf.domain.ApiUser;
import com.kim.mybatis_thymeleaf.mapper.ApiUserMapper;

@Service
public class ApiUserService {
	
	private final ApiUserMapper apiUserMapper;
	
	// @RequiredArgsConstructor 보다 생성자 방식이 권장됨.
	public ApiUserService(ApiUserMapper apiUserMapper) {
		this.apiUserMapper = apiUserMapper;
	}

	public List<ApiUser> getAllApiUsers() {
		return apiUserMapper.selectAllApiUsers();
	}

	@Transactional
	public void deleteUser(ApiUser apiUser) {
		apiUserMapper.deleteUser(apiUser);
	}

	@Transactional
	public void updateUser(ApiUser apiUser) {
		apiUserMapper.updateUser(apiUser);
	}

	public ApiUser getFindUserById(Long id) {
		return apiUserMapper.selectFindUserById(id);
	}

	public void createUser(ApiUser apiUser) {
		apiUserMapper.insertUser(apiUser);
	}
	
}
