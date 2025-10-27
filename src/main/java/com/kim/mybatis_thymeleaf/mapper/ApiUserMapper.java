package com.kim.mybatis_thymeleaf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kim.mybatis_thymeleaf.domain.ApiUser;

@Mapper
public interface ApiUserMapper {
	public List<ApiUser> selectAllApiUsers();
	public ApiUser selectFindUserById(Long id);
	
	public void deleteUser(ApiUser apiUser);
	public void updateUser(ApiUser apiUser);
	public void insertUser(ApiUser apiUser);
	public void deleteUserById(Long id);
}
