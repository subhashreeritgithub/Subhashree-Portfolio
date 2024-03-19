package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.student;
import in.ashokit.repo.StudentRepository;

@RestController

public class StudentRestController<Student> {
	@Autowired
	private StudentRepository srepo;
	
	@GetMapping("/students")
	public Iterable<student> getAllStudents(){
		return srepo.findAll();
	}
	@PostMapping("/student")
	public String addStudent(@RequestBody student student) {
		srepo.save(student);
		return "Student Saved";
	}

}
