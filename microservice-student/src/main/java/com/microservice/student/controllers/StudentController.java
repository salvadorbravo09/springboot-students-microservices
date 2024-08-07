package com.microservice.student.controllers;

import com.microservice.student.entities.Student;
import com.microservice.student.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findStudentById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findById(id));
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    // Endpoint para consumir el microservicio de course
    @GetMapping("/search-by-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findByIdCourse(idCourse));
    }


}
