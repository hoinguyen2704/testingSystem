package com.vti.backend.assignment_4.Exercise_6.Question_2;

public class Employee extends User {
    public Employee(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return getSalaryRatio() * 420;
    }
} 