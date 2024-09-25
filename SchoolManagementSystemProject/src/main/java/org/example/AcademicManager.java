package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class AcademicManager implements AcademicServices {

    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private HashMap<Course, ArrayList<Student>> studentPerCourse;

    public AcademicManager() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.studentPerCourse = new HashMap<>();
    }

    private Course getCourseById(int idCourse) {
        for (Course course : courses) {
            if (course.getId() == idCourse) {
                return course;
            }
        }
        return null;
    }

    private Student getStudentById(int idStudent) {
        for (Student student : students) {
            if (student.getId() == idStudent) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    @Override
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    @Override
    public void enrollStudentInCourse(Student student, int idCourse) throws StudentAlreadyEnrolledException {
        Course course = getCourseById(idCourse);
        if (course != null) {
            ArrayList<Student> studentsList = studentPerCourse.getOrDefault(course, new ArrayList<>());
            if (studentsList.contains(student)) {
                throw new StudentAlreadyEnrolledException("Student already enrolled in course");
            } else {
                studentsList.add(student);
                studentPerCourse.put(course, studentsList);
            }
        }
    }

    @Override
    public void unrollStudentInCourse(int idStudent, int idCourse) throws StudentNotEnrolledException {
        Course course = getCourseById(idCourse);
        if (course != null) {
            ArrayList<Student> studentsList = studentPerCourse.getOrDefault(course, new ArrayList<>());
            Student student = getStudentById(idStudent);
            if (studentsList == null || !studentsList.contains(student)) {
                throw new StudentNotEnrolledException("Student not enrolled in course");
            } else {
                studentsList.remove(student);
            }
        }
    }
}
