package com.kim.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kim.mybatis.domain.Students;

@Mapper
public interface StudentsMapper {

	List<Students> findAll();

	Students findById(Long id);
//	@Select("SELECT * FROM student WHERE id = #{id}")
//	Student findById(Long id);

	void insert(Students student);
//	@Insert("INSERT INTO student(NAME, email, age) \r\n"
//			+ "  	VALUES (#{name}, #{email}, #{age})")
//	@Options(useGeneratedKeys = true, keyProperty = "id")
//	void insert(Student student);

	void update(Students student);
//	@Update("UPDATE student\r\n"
//			+ "	SET NAME = #{name}, email = #{email}, age = #{age}\r\n"
//			+ "	WHERE id = #{id}")
//	void update(Student student);

	void delete(Long id);
//	@Delete("DELETE FROM student WHERE id = #{id}")
//	void delete(Long id);
}
