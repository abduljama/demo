package com.example.demo;


import com.example.demo.Domain.Student;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
import java.util.List;
import org.slf4j.Logger;

@Component
public class TestExternalServer  implements CommandLineRunner{
  private final org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ExternalService externalService;

    public  TestExternalServer ( ExternalService externalService){
        this.externalService= externalService;
    }
    @Override
    public void run(String... strings) throws Exception {
        List<Student> students = externalService.findAllStudentsFromExternalService();
        students.forEach(student -> {
            logger.info("Student name is "+ student.getFirstName());
        });



    }
}
