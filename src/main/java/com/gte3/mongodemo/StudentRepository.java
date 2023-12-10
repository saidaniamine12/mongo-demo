package com.gte3.mongodemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByEmail(String email);
    void deleteByEmail(String email);



}
