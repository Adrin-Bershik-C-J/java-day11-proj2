package com.training.day11proj2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.training.day11proj2.entity.Course;
import com.training.day11proj2.repository.CourseRepository;

@Service
public class CourseServiceInterfaceImplementation implements CourseServiceInterface {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Optional<Course> updateCourseDetails(Long id, Course course) {
        return courseRepository.findById(id).map(oldCourse -> {
            oldCourse.setTitle(course.getTitle());
            oldCourse.setDescription(course.getDescription());
            return courseRepository.save(oldCourse);
        });
    }

    @Override
    public ResponseEntity<Optional<Course>> deleteCourse(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isPresent()) {
            courseRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
