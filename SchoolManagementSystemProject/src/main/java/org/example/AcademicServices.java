package org.example;


public interface AcademicServices {

    void addStudent(Student student);
    void addCourse(Course course);
    void enrollStudentInCourse(Student student, int idCourse) throws StudentAlreadyEnrolledException;
    void unrollStudentInCourse(int idStudent, int idCourse);


}
