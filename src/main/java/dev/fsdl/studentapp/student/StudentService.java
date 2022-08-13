package dev.fsdl.studentapp.student;

import java.util.List;


public interface StudentService {
    List<Student> getStudents();

    void registerNewStudent(Student student);

    void deleteStudent(Long id);
}
