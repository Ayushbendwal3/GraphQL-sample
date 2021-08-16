package com.example.GraphQLsample.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.GraphQLsample.model.Student;
import com.example.GraphQLsample.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final StudentService studentService;

    public String firstQuery() {
        return "first Query";
    }

    public String secondQuery() {
        return "second query";
    }

    public List<Student> getStudent() {
        return studentService.getStudent();
    }
}
