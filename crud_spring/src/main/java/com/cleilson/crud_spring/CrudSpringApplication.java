package com.cleilson.crud_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cleilson.crud_spring.model.Course;
import com.cleilson.crud_spring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabse(CourseRepository courseRepository) {
	    return args -> {
	        courseRepository.deleteAll();

            Course c = new Course();
            c.setName("Angular batata");
            c.setCategory("front-end");

            courseRepository.save(c);
	    };
	}
}
