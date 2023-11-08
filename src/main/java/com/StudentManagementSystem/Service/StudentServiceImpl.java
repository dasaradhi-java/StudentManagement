package com.StudentManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.StudentManagementSystem.Entity.StudentDetails;
import com.StudentManagementSystem.repository.StudentRepository;
@Component
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public StudentDetails registerStudent(StudentDetails details) {		
		return studentRepository.save(details);
	}

	@Override
	public StudentDetails getStudentByRollNo(int rollNo) {
		return studentRepository.findByRollNo(rollNo);
	}

	@Override
	public List<StudentDetails> getAllStudents() {
		return studentRepository.findAll();
	}
   
	@Override
    public StudentDetails deleteStudentByRollNo(int roll_no) {
        StudentDetails student = studentRepository.findByRollNo(roll_no);
        if (student != null) {
            studentRepository.delete(student); // Use delete method on the repository
        }
        return student;
    }

}
