package com.training.day11proj2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.day11proj2.dto.CourseDTO;
import com.training.day11proj2.entity.Course;
import com.training.day11proj2.service.CourseServiceInterface;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseServiceInterface courseService;

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/{id}")
    public Optional<Course> updateCourseDetails(@PathVariable Long id, @RequestBody Course course) {
        return courseService.updateCourseDetails(id, course);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Course>> deleteCourse(@PathVariable Long id) {
        return courseService.deleteCourse(id);
    }

    @GetMapping("/{id}")
    public CourseDTO getCourseDTOById(@PathVariable Long id) {
        return courseService.getCourseDTOById(id);
    }

}
