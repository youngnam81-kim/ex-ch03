package com.kim.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kim.mybatis.domain.Students;
import com.kim.mybatis.mapper.StudentsMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StudentsService {

	private final StudentsMapper studentMapper;

	public List<Students> getAllStudents() {

		return studentMapper.findAll();
//		List<Student> studens = new ArrayList<>();
//		studens.add(new Student() {{setId(1L); setName("홍길동");}});
//		studens.add(new Student() {{setId(2L); setName("이몽룡");}});
//		studens.add(new Student() {{setId(3L); setName("성춘향");}});
//		return studens;
	}

	public Students getStudent(Long id) {
		return studentMapper.findById(id);
	}

	@Transactional
	public void createStudent(Students student) {
		studentMapper.insert(student);

	}

	@Transactional
	public void updateStudent(Students student) {
		studentMapper.update(student);
	}

	@Transactional
	public void deleteStudent(Long id) {
		studentMapper.delete(id);
	}

}
