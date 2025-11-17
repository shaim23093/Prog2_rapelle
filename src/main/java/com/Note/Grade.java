package com.Note;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Student student;
    private Exam exam;
    private List<GradeHistory> history = new ArrayList<>();

    public Grade(Student student, List<GradeHistory> history, Exam exam) {
        this.student = student;
        this.history = history;
        this.exam = exam;
    }

    public Student getStudent() {
        return student;
    }

    public Exam getExam() {
        return exam;
    }

    public List<GradeHistory> getHistory() {
        return history;
    }
}
