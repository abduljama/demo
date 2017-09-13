package com.example.demo.Domain;

import javax.persistence.*;


@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto generated
    private long id;
    private String firstName;
    private String lastName;


    public Student() {

    }

    public Student( String first_name, String last_name) {
        this.firstName = first_name;
        this.lastName = last_name;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }
}
