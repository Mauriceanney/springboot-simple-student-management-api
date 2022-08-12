package dev.fsdl.studentapp.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

    @Override
    public void registerNewStudent(Student student) {
        Optional<String > studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }

}
