package com.vti.backend.assignment_4.Exercise_6.Question_2;

public class DemoUser {
    public static void main(String[] args) {
        User emp = new Employee("Nam", 2.5);
        User mgr = new Manager("An", 3.0);
        User waiter = new Waiter("Binh", 1.8);
        System.out.println("--- Thông tin nhân viên ---");
        emp.displayInfor();
        mgr.displayInfor();
        waiter.displayInfor();
    }
} 