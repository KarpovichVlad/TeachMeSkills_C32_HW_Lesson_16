package com.teachmeskills.c32.hw.lesson_16.student.manager;

import com.teachmeskills.c32.hw.lesson_16.student.model.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentManager {
    private Set<Student> students;

    public StudentManager() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Set<Student> getStudents() {
        return students;
    }
}
