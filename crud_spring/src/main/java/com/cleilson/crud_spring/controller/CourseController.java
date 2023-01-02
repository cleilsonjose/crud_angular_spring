package com.cleilson.crud_spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cleilson.crud_spring.model.Course;
import com.cleilson.crud_spring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    /*
     * public CourseController(CourseRepository courseRepository) {
     * this.courseRepository = courseRepository;
     * }
    */
    // @RequestMapping(method = RequestMethod.GET)
    
    @GetMapping
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }
    
}
