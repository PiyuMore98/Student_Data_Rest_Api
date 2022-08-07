package com.softSolution.service;

import java.util.List;

import com.softSolution.model.Student;

public interface StudentServI {

	public int addStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudentById(Integer id);
}
