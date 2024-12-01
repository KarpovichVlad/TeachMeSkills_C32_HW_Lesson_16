package com.teachmeskills.c32.hw.lesson_16.passport;

import java.util.HashSet;
import java.util.Set;

public class PassportManager {
    private Set<String> passportNumbers;

    public PassportManager() {
        this.passportNumbers = new HashSet<>();
    }

    public void addPassport(String passportNumber) {
        passportNumbers.add(passportNumber);
    }

    public Set<String> getPassportNumbers() {
        return passportNumbers;
    }
}
