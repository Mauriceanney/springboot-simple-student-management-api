package dev.fsdl.studentapp.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1L, "Jhon", "jhon@gmail.com", LocalDate.of(2000, Month.JANUARY, 6), 21)
        );
    }
    
}
