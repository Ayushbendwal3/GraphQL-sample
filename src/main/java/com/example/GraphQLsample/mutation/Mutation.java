package com.example.GraphQLsample.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.GraphQLsample.exception.StudentNotFoundException;
import com.example.GraphQLsample.model.Student;
import com.example.GraphQLsample.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private final StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        Student old_student = studentRepository.findById(id).orElseThrow( () -> {
            throw new StudentNotFoundException("Student with given id not found!");
        });
        old_student.setAddress(student.getAddress());
        old_student.setFirstname(student.getFirstname());
        old_student.setLastname(student.getLastname());

        return studentRepository.save(old_student);
    }

}
