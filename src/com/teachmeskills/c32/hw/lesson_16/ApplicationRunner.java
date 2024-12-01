package com.teachmeskills.c32.hw.lesson_16;

import com.teachmeskills.c32.hw.lesson_16.passportstudentmap.PassportStudentMapper;
import com.teachmeskills.c32.hw.lesson_16.passport.PassportManager;
import com.teachmeskills.c32.hw.lesson_16.student.model.Student;
import com.teachmeskills.c32.hw.lesson_16.student.manager.StudentManager;

public class ApplicationRunner {
    public static void main(String[] args) {

        PassportManager passportManager = new PassportManager();
        StudentManager studentManager = new StudentManager();
        PassportStudentMapper mapper = new PassportStudentMapper();

        passportManager.addPassport("XY987654");
        passportManager.addPassport("ZT876543");
        passportManager.addPassport("GH765432");
        passportManager.addPassport("JK654321");
        passportManager.addPassport("LM543210");
        passportManager.addPassport("NO432109");
        passportManager.addPassport("PQ321098");
        passportManager.addPassport("RS210987");
        passportManager.addPassport("TU109876");
        passportManager.addPassport("VW098765");
        passportManager.addPassport("AB987654");


        studentManager.addStudent(new Student("Andrew"));
        studentManager.addStudent(new Student("Kate"));
        studentManager.addStudent(new Student("Dmitry"));
        studentManager.addStudent(new Student("Kirill"));
        studentManager.addStudent(new Student("Oleg"));
        studentManager.addStudent(new Student("Fluffic"));
        studentManager.addStudent(new Student("Sergio"));
        studentManager.addStudent(new Student("Rita"));
        studentManager.addStudent(new Student("Vlad"));
        studentManager.addStudent(new Student("Flame_host"));
        studentManager.addStudent(new Student("Marina"));


        mapper.mapPassportsToStudents(passportManager.getPassportNumbers(), studentManager.getStudents());

        mapper.printMapping();
    }
}
