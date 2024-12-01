package com.teachmeskills.c32.hw.lesson_16.passportstudentmap;

import com.teachmeskills.c32.hw.lesson_16.student.model.Student;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class PassportStudentMapper {
    private Map<String, Student> passportToStudentMap;

    public PassportStudentMapper() {
        this.passportToStudentMap = new HashMap<>();
    }

    public void mapPassportsToStudents(Set<String> passports, Set<Student> students) {
        Iterator<String> passportIterator = passports.iterator();
        Iterator<Student> studentIterator = students.iterator();

        while (passportIterator.hasNext() && studentIterator.hasNext()) {
            passportToStudentMap.put(passportIterator.next(), studentIterator.next());
        }
    }

    public void printMapping() {
        for (Map.Entry<String, Student> entry : passportToStudentMap.entrySet()) {
            System.out.println("Паспорт: " + entry.getKey() + ", Студент: " + entry.getValue());
        }
    }
}
