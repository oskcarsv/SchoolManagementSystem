package org.example;

import java.util.Date;

public class Student extends Person {

    private String status;

    public Student() {
    }

    public Student(int id, String name, String lastName, Date birthDate, String status) {
        super(id, name, lastName, birthDate);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
