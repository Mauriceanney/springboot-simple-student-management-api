package dev.fsdl.studentapp.student;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
          Student marie = new Student("marie", "marie@gmail.com", LocalDate.of(2000, Month.JANUARY, 10));
          Student jhon = new Student("jhon", "jhon@gmail.com", LocalDate.of(1995, Month.MARCH, 24));

          studentRepository.saveAll(List.of(marie, jhon));
        };
    }
}
