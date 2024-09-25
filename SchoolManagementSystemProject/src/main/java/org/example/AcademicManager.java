package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class AcademicManager implements AcademicServices {

    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private HashMap<Course, ArrayList<Student>> studentPerCourse;

    public AcademicManager() {
    }

    public AcademicManager(ArrayList<Student> students, ArrayList<Course> courses, HashMap<Course, ArrayList<Student>> studentPerCourse) {
        this.students = students;
        this.courses = courses;
        this.studentPerCourse = studentPerCourse;
    }


    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public void enrollStudentInCourse(Student student, int idCourse) throws StudentAlreadyEnrolledException {

    }

    @Override
    public void unrollStudentInCourse(int idStudent, int idCourse) throws StudentNotEnrolledException {

    }
}
