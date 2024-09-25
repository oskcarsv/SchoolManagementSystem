package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class AcademicManager {

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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public HashMap<Course, ArrayList<Student>> getStudentPerCourse() {
        return studentPerCourse;
    }

    public void setStudentPerCourse(HashMap<Course, ArrayList<Student>> studentPerCourse) {
        this.studentPerCourse = studentPerCourse;
    }
}
