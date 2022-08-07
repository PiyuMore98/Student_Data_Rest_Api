package com.softSolution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softSolution.model.Student;
import com.softSolution.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentServI{

	@Autowired
	private StudentRepository sr;

	@Override
	public int addStudent(Student student) {
		Student stu = sr.save(student);
		return stu.getSid();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> all = sr.findAll();
		return all;
	}

	@Override
	public Student getStudentById(Integer id) {
		 Student findById = sr.findById(id).get();
		return findById;
	}

}
