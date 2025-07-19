package com.vti.backend.assignment_4.Question_3;

public abstract class Student extends Person {
    protected int id;

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
