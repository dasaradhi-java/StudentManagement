package com.StudentManagementSystem.Service;

import java.util.List;

import com.StudentManagementSystem.Entity.StudentDetails;

public interface StudentService {
	
	StudentDetails registerStudent(StudentDetails details);
	StudentDetails getStudentByRollNo(int rollNo);
	List<StudentDetails> getAllStudents();
	StudentDetails deleteStudentByRollNo(int rollNo);
	

}
