package org.example;

public class StudentAlreadyEnrolledException extends Exception  {
    public StudentAlreadyEnrolledException(String message) {
        super(message);
    }
}
