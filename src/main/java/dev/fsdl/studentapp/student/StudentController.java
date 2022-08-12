package dev.fsdl.studentapp.student;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.registerNewStudent(student);
    }
}
