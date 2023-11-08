package com.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagementSystem.Entity.StudentDetails;


public interface StudentRepository extends JpaRepository<StudentDetails, Integer>{
	
	StudentDetails findByRollNo(int rollNo);
	
	StudentDetails deleteStudentByRollNo(int roll_no);

}
