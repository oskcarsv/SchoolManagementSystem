package org.example;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Create a new student
        Student student1 = new Student(1, "John", "Doe", new  Date(), "Active");
        Student student2 = new Student(2, "Jane", "Doe", new  Date(), "Active");

        // Create a new course
        Course course1 = new Course(1, "Math", "Math course", "5", "1.0");
        Course course2 = new Course(2, "English", "English course", "5", "1.0");

        // Create a new AcademicManager
        AcademicManager academicManager = new AcademicManager();
        academicManager.addStudent(student1);
        academicManager.addStudent(student2);
        academicManager.addCourse(course1);
        academicManager.addCourse(course2);

        // Enroll the student in the course
        try {
            academicManager.enrollStudentInCourse(student1, course1.getId());
            academicManager.enrollStudentInCourse(student2, course2.getId());
            System.out.println("Student enrolled in course");
        } catch (StudentAlreadyEnrolledException e) {
            System.out.println(e.getMessage());
        }

        // Verify if the student is enrolled in the course
        ArrayList<Student> students = academicManager.getStudentsByCourse(course1);


    }
}