package com.kim.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kim.mybatis.domain.Students;
import com.kim.mybatis.service.StudentsService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentsController {

	private final StudentsService studentService;

	// 전체 리스트 화면
	@GetMapping
	public String list(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student/lists";
	}
		
	//등록 form
	@GetMapping("/new")
	public String createForm(Model model) {

		model.addAttribute("student", new Students());
		return "student/forms";
	}

	//등록처리
	@PostMapping
	public String create(@ModelAttribute Students student) {
		studentService.createStudent(student);
		return "redirect:/students";
	}

	//수정 form
	@GetMapping("/{id}/edit")
	public String updateForm(@PathVariable Long id, Model model) {

		model.addAttribute("student", studentService.getStudent(id));
		return "student/forms";
	}
	
	//수정처리
	@PostMapping("/{id}")
	public String update(@PathVariable Long id, @ModelAttribute Students student) {

		student.setId(id);
		studentService.updateStudent(student);
		return "redirect:/students";
	}
	
	//삭제처리
	@PostMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}

}