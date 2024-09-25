package org.example;

public class StudentNotEnrolledException extends RuntimeException {
    public StudentNotEnrolledException(String message) {
        super(message);
    }
}
