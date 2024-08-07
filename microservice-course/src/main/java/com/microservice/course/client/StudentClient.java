package com.microservice.course.client;

import com.microservice.course.dtos.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/*
    Asignamos en nombre del microservicio que vamos a consumir que esta en el application.yml,
    y le asignamos la url del controller.
*/
@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface StudentClient {

    @GetMapping("/search-by-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);
}
