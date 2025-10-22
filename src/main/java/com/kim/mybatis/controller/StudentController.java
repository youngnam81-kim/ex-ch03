package com.kim.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kim.mybatis.domain.Student;
import com.kim.mybatis.service.StudentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;

	// 전체 리스트 화면
	@GetMapping
	public String list(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student/list";
	}
		
	//등록 form
	@GetMapping("/new")
	public String createForm(Model model) {

		model.addAttribute("student", new Student());
		return "student/form";
	}

	//등록처리
	@PostMapping
	public String create(@ModelAttribute Student student) {
		studentService.createStudent(student);
		return "redirect:/students";
	}

	//수정 form
	@GetMapping("/{id}/edit")
	public String updateForm(@PathVariable Long id, Model model) {

		model.addAttribute("student", studentService.getStudent(id));
		return "student/form";
	}
	
	//수정처리
	@PostMapping("/{id}")
	public String update(@PathVariable Long id, @ModelAttribute Student student) {

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