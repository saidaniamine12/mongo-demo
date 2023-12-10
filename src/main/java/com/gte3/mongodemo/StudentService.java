package com.gte3.mongodemo;


import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {

    List<Student> getAll();
    Student getByEmail(String email);
    String deleteByEmail(String email);
    String createStudent(Student studentModel);
    String updateStudent(String email, Student student);

}