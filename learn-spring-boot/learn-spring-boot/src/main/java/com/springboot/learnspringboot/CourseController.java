package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	//courses
	//course: id,name,author
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learm AWS","Raj"),
				new Course(2,"Learn DevOps","Raj"),
				new Course(3,"Learn Azure","Raj")
				);
	}
	
}
