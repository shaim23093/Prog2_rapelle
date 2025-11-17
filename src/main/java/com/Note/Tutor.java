package com.Note;

import java.time.LocalDate;

public class Tutor extends Person {
    private String description;

    public Tutor(int id, String firstName, String lastName, LocalDate birthDate, String email, String phone) {
        super(id, firstName, lastName, birthDate, email, phone);
    }

    public String getDescription() {
        return description;
    }
}
