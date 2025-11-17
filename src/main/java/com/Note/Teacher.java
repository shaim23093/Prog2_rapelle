package com.Note;

import java.time.LocalDate;

public class Teacher extends  Person {
    private String specialty;

    public Teacher(int id, String firstName, String lastName, LocalDate birthDate, String email, String phone) {
        super(id, firstName, lastName, birthDate, email, phone);
    }

    public String getSpecialty() {
        return specialty;
    }
}
