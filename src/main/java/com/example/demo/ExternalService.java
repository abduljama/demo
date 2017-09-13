package com.example.demo;

import com.example.demo.Domain.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient( url = "https://hshkhnutpf.localtunnel.me" , name = "getStudents")
public interface ExternalService {
    @RequestMapping(value = "/students" , method = RequestMethod.GET)
    List<Student> findAllStudentsFromExternalService();
}
