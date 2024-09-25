package org.example;

public class StudentNotEnrolledInCourseException extends RuntimeException {
    public StudentNotEnrolledInCourseException(String message) {
        super(message);
    }
}
