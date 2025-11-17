package com.Note;

import java.time.LocalDate;

public class Person {
    protected int id;
    protected String lastName;
    protected String firstName;
    protected LocalDate birthDate;
    protected String email;
    protected String phone;

    public Person(int id, String firstName, String lastName, LocalDate birthDate, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
