package com.Note;

import java.time.LocalDate;

public class Student extends  Person {
    private String group;
    private Tutor tutor;

    public Student(int id, String firstName, String lastName, LocalDate birthDate, String email, String phone) {
        super(id, firstName, lastName, birthDate, email, phone);
    }

    public String getGroup() {
        return group;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
