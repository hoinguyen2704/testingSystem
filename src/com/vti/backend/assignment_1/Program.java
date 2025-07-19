package com.vti.backend.assignment_1;

import com.vti.entity.*;

public class Program {
    public static void main(String[] args) throws java.text.ParseException {
        // Department
        Department dep1 = new Department(1, "Sale");
        Department dep2 = new Department(2, "Marketing");
        Department dep3 = new Department(3, "IT");
        System.out.println("Department 1: " + dep1.getDepartmentName());

        // Position
        Position pos1 = new Position(1, "Dev");
        Position pos2 = new Position(2, "Test");
        Position pos3 = new Position(3, "PM");
        System.out.println("Position 1: " + pos1.getPositionName());

        // Account
        // Account(int accountID, String email, String userName, String fullName,
        // Department department, Position position, Date createDate)
        Account acc1 = new Account(1, "a1@email.com", "user1", "User One", dep1, pos1, new java.util.Date());
        Account acc2 = new Account(2, "a2@email.com", "user2", "User Two", dep2, pos2, new java.util.Date());
        Account acc3 = new Account(3, "a3@email.com", "user3", "User Three", dep3, pos3, new java.util.Date());
        System.out.println("Account 1: " + acc1.getUserName());

        // Group
        Group group1 = new Group((short) 1, "Group A", acc1, new java.util.Date());
        Group group2 = new Group((short) 2, "Group B", acc2, new java.util.Date());
        Group group3 = new Group((short) 3, "Group C", acc3, new java.util.Date());
        System.out.println("Group 1: " + group1.getGroupName());

        // GroupAccount
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd");
        GroupAccount ga1 = new GroupAccount(1, 1, sdf.parse("2024/02/01"));
        GroupAccount ga2 = new GroupAccount(2, 2, sdf.parse("2024/02/02"));
        GroupAccount ga3 = new GroupAccount(3, 3, sdf.parse("2024/02/03"));
        java.text.SimpleDateFormat vnFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngày tham gia của GroupAccount 1: " + vnFormat.format(ga1.getJoinDate()));

        // TypeQuestion
        TypeQuestion tq1 = new TypeQuestion(1, "Essay");
        TypeQuestion tq2 = new TypeQuestion(2, "Multiple-Choice");
        TypeQuestion tq3 = new TypeQuestion(3, "True/False");
        System.out.println("TypeQuestion 1: " + tq1.getTypeName());

        // CategoryQuestion
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion cq3 = new CategoryQuestion(3, "SQL");
        System.out.println("CategoryQuestion 1: " + cq1.getCategoryName());

        // Question
        Question q1 = new Question(1, "What is Java?", 1, 1, 1, sdf.parse("2024/03/01"));
        Question q2 = new Question(2, "Explain OOP.", 1, 2, 2, sdf.parse("2024/03/02"));
        Question q3 = new Question(3, "What is SQL?", 3, 1, 3, sdf.parse("2024/03/03"));
        System.out.println("Question 1: " + q1.getContent());

        // Answer
        Answer a1 = new Answer(1, "Java is a programming language.", 1, true);
        Answer a2 = new Answer(2, "OOP stands for Object Oriented Programming.", 2, true);
        Answer a3 = new Answer(3, "SQL is used for databases.", 3, true);
        System.out.println("Answer 1: " + a1.getContent());

        // Exam
        Exam e1 = new Exam(1, "EX001", "Java Basics", 1, 60, 1, sdf.parse("2024/04/01"));
        Exam e2 = new Exam(2, "EX002", ".NET Basics", 2, 60, 2, sdf.parse("2024/04/02"));
        Exam e3 = new Exam(3, "EX003", "SQL Basics", 3, 60, 3, sdf.parse("2024/04/03"));
        System.out.println("Exam 1: " + e1.getTitle());

        // ExamQuestion
        ExamQuestion eq1 = new ExamQuestion(1, 1);
        ExamQuestion eq2 = new ExamQuestion(2, 2);
        ExamQuestion eq3 = new ExamQuestion(3, 3);
        System.out.println("ExamQuestion 1 ExamID: " + eq1.getExamID());
    }
}
