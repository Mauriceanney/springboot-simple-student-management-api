package dev.fsdl.studentapp.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1L, "Jhon", "jhon@gmail.com", LocalDate.of(2000, Month.JANUARY, 6), 21)
        );
    }
}
