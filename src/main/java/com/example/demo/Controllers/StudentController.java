package com.example.demo.Controllers;


import com.example.demo.Domain.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value ="students" , produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})

public class StudentController {

//    @Autowired
//    private StudentRepository studentRepository;
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @PostMapping
    public Student createStudent ( @RequestBody  Student student){
        return  studentRepository.save(student);
    }
    @GetMapping(value = "search")
    public List<Student> search(@RequestParam String firstName){
        return studentRepository.findByFirstNameContainingIgnoreCase(firstName);
    }

    @GetMapping
    public List<Student> findAll(){
        return studentRepository.findAll(); }

    @GetMapping(value = "{id}")
    public  Student findById (@PathVariable Long id){
        return studentRepository.findOne(id);
    }

    @DeleteMapping
    public  void deleteStudent (@PathVariable Long id){
        studentRepository.delete(id);}




}
