package com.vti.backend.assignment_4.Question_3;

abstract class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

abstract class Student extends Person {
    protected int id;
    public Student(int id, String name) {
        super(name);
        this.id = id;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}

class HighSchoolStudent extends Student {
    private String clazz;
    private String desiredUniversity;
    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(id, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }
    public String getClazz() { return clazz; }
    public void setClazz(String clazz) { this.clazz = clazz; }
    public String getDesiredUniversity() { return desiredUniversity; }
    public void setDesiredUniversity(String desiredUniversity) { this.desiredUniversity = desiredUniversity; }
    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                '}';
    }
}

public class DemoHighSchoolStudent {
    public static void main(String[] args) {
        HighSchoolStudent hsStudent = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học công nghệ");
        System.out.println(hsStudent);
    }
} 