package com.kim.mybatis_thymeleaf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kim.mybatis_thymeleaf.domain.Student;

@Mapper
public interface StudentMapper {
	public List<Student> selectAllStudents();
	public Student selectFindStudentById(Long id);
	public void insertStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public void deleteStudentById(Long id);
	
//    Student findById(Long id);
//    void insert(Student student);
//    void update(Student student);
//    void delete(Long id);
}
