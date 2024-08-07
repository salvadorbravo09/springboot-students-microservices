package com.microservice.course.controllers;

import com.microservice.course.entities.Course;
import com.microservice.course.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourse() {
        return ResponseEntity.status(HttpStatus.OK).body(courseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findCourseById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(courseService.findById(id));
    }

    @GetMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course) {
        courseService.save(course);
    }

    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long idCourse) {
        return ResponseEntity.status(HttpStatus.OK).body(courseService.findStudentsByIdCourse(idCourse));
    }
}
