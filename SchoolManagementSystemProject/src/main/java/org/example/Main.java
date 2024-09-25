package org.example;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Create a new student
        Student student = new Student(1, "John", "Doe", new  Date(), "Active");

        // Create a new course
        Course course = new Course(1, "Math", "Math course", "5", "1.0");

        // Create a new AcademicManager
        AcademicManager academicManager = new AcademicManager();
        academicManager.addStudent(student);
        academicManager.addCourse(course);

        // Enroll the student in the course
        try {
            academicManager.enrollStudentInCourse(student, course.getId());
            System.out.println("Student enrolled in course");
        } catch (StudentAlreadyEnrolledException e) {
            System.out.println(e.getMessage());
        }

        // Verify if the student is enrolled in the course
        ArrayList<Student> enrolled = academicManager.printStudentsInCourse(course.getId());
        System.out.println("Number of students enrolled in course: " + enrolled.size());

    }
}