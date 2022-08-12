package dev.fsdl.studentapp.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    
}
