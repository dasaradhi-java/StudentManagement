package com.StudentManagementSystem.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagementSystem.Entity.StudentDetails;
import com.StudentManagementSystem.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	@PostMapping("/save")
	public StudentDetails registerStudent(@RequestBody StudentDetails studentDetails) {
		return studentService.registerStudent(studentDetails);
	}

	@GetMapping("/findByRollNo/{rollNo}")
	public StudentDetails findBYRollNo(@PathVariable int rollNo) {
	    return studentService.getStudentByRollNo(rollNo);
	}

	@GetMapping("/getAll")
	public List<StudentDetails> getAllStudentDetails() {
		return studentService.getAllStudents();
	}
	@DeleteMapping("delete/{roll_no}")
    public StudentDetails deleteStudentByRollNo(@PathVariable int roll_no) {        
        return studentService.deleteStudentByRollNo(roll_no);
    }

}
