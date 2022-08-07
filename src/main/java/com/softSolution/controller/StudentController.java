package com.softSolution.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softSolution.model.Student;
import com.softSolution.service.StudentServI;


@RestController
public class StudentController {

	 private StudentServI  ssi;
	
	@PostMapping(value = "/saveStudent", consumes = { "application/xml", "application/json" }, produces = {"application/json", "application/xml" })			
	public ResponseEntity<Integer> addStudent(@RequestBody Student stu) {
		int id = (int) ssi.addStudent(stu);
		String msg = "Student Saved Successfully";
		return new ResponseEntity<Integer>( id,HttpStatus.CREATED) ;
	}

	@GetMapping(value="/getAllStudent",produces = "application/json")
	public ResponseEntity< List<Student>> getAllStudent() {
		List<Student> allStudent = ssi.getAllStudent();
		return new ResponseEntity<List<Student>> ( allStudent,HttpStatus.OK);
	}
	
	@GetMapping(value="/getStudentById/{sid}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer sid) {
		  Student student = ssi.getStudentById(sid);
		return new ResponseEntity<Student> (student,HttpStatus.OK);
	}

}
