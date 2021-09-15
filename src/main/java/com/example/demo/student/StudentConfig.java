package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Mike = new Student(
                    "Mike", 30, LocalDate.of(2000, Month.JANUARY, 25), "Mike@163.com"
            );
            Student Linda = new Student(
                    "Alex", 30, LocalDate.of(2000, Month.JANUARY, 25), "Alex@163.com"
            );

            studentRepository.saveAll(
                    List.of(Mike, Linda));
        };
    }
}
