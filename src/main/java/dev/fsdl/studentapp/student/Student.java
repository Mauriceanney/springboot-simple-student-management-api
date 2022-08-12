package dev.fsdl.studentapp.student;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data @AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

}
