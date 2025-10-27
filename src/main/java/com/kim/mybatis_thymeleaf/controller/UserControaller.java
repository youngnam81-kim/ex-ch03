package com.kim.mybatis_thymeleaf.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kim.mybatis_thymeleaf.domain.ApiUser;
import com.kim.mybatis_thymeleaf.domain.Student;
import com.kim.mybatis_thymeleaf.service.ApiUserService;
import com.kim.mybatis_thymeleaf.service.StudentService;

@Controller
@RequestMapping("/user")
public class UserControaller {

	private final StudentService studentService;
	private final ApiUserService apiUserService;

	public UserControaller(StudentService studentService, ApiUserService apiUserService) {
		this.studentService = studentService;
		this.apiUserService = apiUserService;
	}

	// 전체 유저 목록 화면
	@GetMapping
	public String getAllUsers(Model model) {
		List<Student> studentList = studentService.getAllStudents();
		model.addAttribute("students", studentList);

		List<ApiUser> apiUserList = apiUserService.getAllApiUsers();
		model.addAttribute("apiUsers", apiUserList);

		return "student/list";
	}

	// 단건 조회
	@GetMapping("/{id}")
	public ResponseEntity<ApiUser> getFindStudentById(@PathVariable Long id) {
		ApiUser apiUser = apiUserService.getFindUserById(id);
		return ResponseEntity.ok(apiUser);
	}

	// 등록 화면
	@GetMapping("/new")
	public String createForm(Model model, ApiUser apiUser) {
		model.addAttribute("apiUser", apiUser);
		return "student/formUser";
	}

	// 등록 서비스
	@PostMapping
	private String createStudent(@ModelAttribute ApiUser apiUser) {
		apiUserService.createUser(apiUser);
		return "redirect:/student";
	}

	// 단건 수정 화면
	@GetMapping("/edit/{id}")
	public String updateView(@PathVariable Long id, Model model) {
		ApiUser apiUser = apiUserService.getFindUserById(id);
		model.addAttribute("student", apiUser);

		return "student/formUser";
	}

	// 수정 서비스
	@PostMapping("/{id}")
	private String updateStudent(@ModelAttribute ApiUser apiUser) {
		apiUserService.updateUser(apiUser);
		return "redirect:/student";
	}

	// 삭제 서비스
	@PostMapping("/delete/{id}")
	private String deleteStudent(@ModelAttribute ApiUser apiUser) {
		apiUserService.deleteUser(apiUser);
		return "redirect:/student";
	}

}
