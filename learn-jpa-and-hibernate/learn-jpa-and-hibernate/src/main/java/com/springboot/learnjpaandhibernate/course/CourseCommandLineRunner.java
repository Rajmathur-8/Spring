package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpa;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repo;
	
//	@Autowired
//	private CourseJpaRepository repo;
	
	@Autowired
	private CourseSpringDataJpa repo;
	
	@Override
	public void run(String... args) throws Exception {
			repo.save(new Course(1,"Learn AWS","Raj"));
			repo.save(new Course(2,"Learn AZURE","Raj"));
			repo.save(new Course(3,"Learn DevOps","Raj"));
			
			System.out.println(repo.findById(2l));
			System.out.println(repo.findById(3l));
			repo.deleteById(3l);
			
			System.out.println(repo.findAll());
			System.out.println(repo.count());
			System.out.println(repo.findByAuthor("Raj"));
			System.out.println(repo.findByAuthor(""));
			System.out.println(repo.findByName("Learn AZURE"));
			System.out.println(repo.findByName("Learn AWS"));
						
	}

}
