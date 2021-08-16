package com.example.GraphQLsample.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String message) {
        super(message);
    }
    public StudentNotFoundException(String message, Exception e) {
        super(message, e);
    }
}
