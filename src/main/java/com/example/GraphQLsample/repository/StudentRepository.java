package com.example.GraphQLsample.repository;

import com.example.GraphQLsample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
