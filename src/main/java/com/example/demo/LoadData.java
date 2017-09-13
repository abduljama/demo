package com.example.demo;

import com.example.demo.Domain.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class LoadData implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... strings) throws Exception {
        studentRepository.save(Arrays.asList(
                new Student(" Abdul ", "Jama"),
                new Student(" Ian ", "Habesha")
        ));

    }
}
