package com.vti.backend.assignment_4;

import com.vti.entity.*;

public class Exercise4 {
    public static void main(String[] args) {
        // Exercise 1 - Question 1: Department
        Department dep1 = new Department();
        Department dep2 = new Department("Sale");
        System.out.println("Department 1: " + dep1.getDepartmentName());
        System.out.println("Department 2: " + dep2.getDepartmentName());

        // Exercise 1 - Question 2: Account
        // a) Không có parameters
        Account acc1 = new Account();

        // b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName
        // = FirstName + LastName)
        Account acc2 = new Account(1, "a@email.com", "user1", "First", "Last");

        // c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName
        // = FirstName + LastName) và Position của User, default createDate = now
        Position pos = new Position(1, "Dev");
        Account acc3 = new Account(2, "b@email.com", "user2", "First2", "Last2", pos);

        // d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName
        // = FirstName + LastName) và Position của User, createDate.
        java.util.Date date = new java.util.Date();
        Account acc4 = new Account(3, "c@email.com", "user3", "First3", "Last3", pos, date);

        System.out.println("Account 1: " + acc1.getUserName());
        System.out.println("Account 2: " + acc2.getFullName());
        System.out.println("Account 3: " + acc3.getFullName() + ", Position: " + acc3.getPosition().getPositionName());

        System.out.println("Account 4: " + acc4);

        // Question 3: Group

        // a) Không có parameters
        Group group1 = new Group();

        // b) Có các parameter là GroupName, Creator, array Account[] accounts,
        // CreateDate
        Account[] accounts = { acc1, acc2, acc3 };
        Group group2 = new Group("Java Group", acc3, accounts, new java.util.Date());

        // c) Có các parameter là GroupName, Creator, array String[] usernames ,
        // CreateDate
        String[] usernames = { "userA", "userB", "userC" };
        Group group3 = new Group("Python Group", acc4, usernames, new java.util.Date());

        System.out.println("Group 1: " + group1.getGroupName());
        System.out
                .println("Group 2: " + group2.getGroupName() + ", Creator: " + group2.getcreateAccount().getUserName());
        System.out
                .println("Group 3: " + group3.getGroupName() + ", Creator: " + group3.getcreateAccount().getUserName());
    }

    public void printStudent() {
        Student st1 = new Student("Hội", "Bắc Giang");
        st1.congDiem(1f);
        Student st2 = new Student("Hường", "Hà Nội");
        st2.congDiem(5f);
        Student st3 = new Student("Hồng", "Hà Nam");
        st3.congDiem(8f);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
