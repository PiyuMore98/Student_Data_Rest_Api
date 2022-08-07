package com.softSolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softSolution.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
