package com.vti.backend.assignment_2;

import com.vti.entity.*;

public class Program_assignment2 {
    @SuppressWarnings("unused")
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
        // public Account(int accountID, String email, String userName, String fullName,
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
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        GroupAccount ga1 = new GroupAccount(1, 1, sdf.parse("2024-02-01"));
        GroupAccount ga2 = new GroupAccount(2, 2, sdf.parse("2024-02-02"));
        GroupAccount ga3 = new GroupAccount(3, 3, sdf.parse("2024-02-03"));
        System.out.println("GroupAccount 1 JoinDate: " + ga1.getJoinDate());

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
        Question q1 = new Question(1, "What is Java?", 1, 1, 1, sdf.parse("2024-03-01"));
        Question q2 = new Question(2, "Explain OOP.", 1, 2, 2, sdf.parse("2024-03-02"));
        Question q3 = new Question(3, "What is SQL?", 3, 1, 3, sdf.parse("2024-03-03"));
        System.out.println("Question 1: " + q1.getContent());

        // Answer
        Answer a1 = new Answer(1, "Java is a programming language.", 1, true);
        Answer a2 = new Answer(2, "OOP stands for Object Oriented Programming.", 2, true);
        Answer a3 = new Answer(3, "SQL is used for databases.", 3, true);
        System.out.println("Answer 1: " + a1.getContent());

        // Exam
        Exam e1 = new Exam(1, "EX001", "Java Basics", 1, 60, 1, sdf.parse("2024-04-01"));
        Exam e2 = new Exam(2, "EX002", ".NET Basics", 2, 60, 2, sdf.parse("2024-04-02"));
        Exam e3 = new Exam(3, "EX003", "SQL Basics", 3, 60, 3, sdf.parse("2024-04-03"));
        System.out.println("Exam 1: " + e1.getTitle());

        // ExamQuestion
        ExamQuestion eq1 = new ExamQuestion(1, 1);
        ExamQuestion eq2 = new ExamQuestion(2, 2);
        ExamQuestion eq3 = new ExamQuestion(3, 3);
        System.out.println("ExamQuestion 1 ExamID: " + eq1.getExamID());
        System.out.println("\n\n\n\nASSIGMENT2\n\n\n\n");

        // --- ASSIGMENT2 ---
        // Question 1: Kiểm tra account thứ 2 có phòng ban không
        if (acc2.getDepartment() == null) {
            System.out.println("Nhân viên 2 chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên 2 là " + acc2.getDepartment().getDepartmentName());
        }

        // Question 2: Kiểm tra account thứ 2 có group không (giả lập group cho acc2)
        Group[] groupsOfAcc2 = { group1, group2 }; // bạn có thể thay đổi số lượng group để test các trường hợp khác
        if (groupsOfAcc2 == null || groupsOfAcc2.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (groupsOfAcc2.length == 1 || groupsOfAcc2.length == 2) {
            System.out.print("Group của nhân viên 2 là ");
            for (int i = 0; i < groupsOfAcc2.length; i++) {
                System.out.print(groupsOfAcc2[i].getGroupName());
                if (i < groupsOfAcc2.length - 1)
                    System.out.print(", ");
            }
            System.out.println();
        } else if (groupsOfAcc2.length == 3) {
            System.out.println("Nhân viên 2 là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên 2 là người hóng chuyện, tham gia tất cả các group");
        }

        // Question 3: Sử dụng toán tử ternary cho Question 1
        System.out.println(acc2.getDepartment() == null ? "Nhân viên 2 chưa có phòng ban"
                : "Phòng ban của nhân viên 2 là " + acc2.getDepartment().getDepartmentName());

        // Question 4: Ternary kiểm tra Position của account thứ 1
        System.out.println(pos1.getPositionName().equalsIgnoreCase("Dev") ? "Đây là Developer"
                : "Người này không phải là Developer");

        // Question 5: Sử dụng switch-case để in ra số lượng account thực sự thuộc
        // group1
        int group1Id = group1.getGroupID();
        int group1Count = 0;
        GroupAccount[] groupAccounts = { ga1, ga2, ga3 }; // giả lập dữ liệu liên kết
        for (GroupAccount ga : groupAccounts) {
            if (ga.getGroupID() == group1Id) {
                group1Count++;
            }
        }
        switch (group1Count) {
            case 1:
                System.out.println("Nhóm 1 có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm 1 có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm 1 có ba thành viên");
                break;
            default:
                System.out.println("Nhóm 1 có nhiều thành viên");
        }

        // Question 6: SWITCH CASE cho số lượng group của account 2
        int groupCount = groupsOfAcc2.length;
        switch (groupCount) {
            case 0:
                System.out.println("Nhân viên 2 chưa có group");
                break;
            case 1:
            case 2:
                System.out.print("Group của nhân viên 2 là ");
                for (int i = 0; i < groupsOfAcc2.length; i++) {
                    System.out.print(groupsOfAcc2[i].getGroupName());
                    if (i < groupsOfAcc2.length - 1)
                        System.out.print(", ");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Nhân viên 2 là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên 2 là người hóng chuyện, tham gia tất cả các group");
        }

        // Question 7: SWITCH CASE kiểm tra Position của account 1
        String posName = pos1.getPositionName();
        switch (posName) {
            case "Dev":
                System.out.println("nhân viên 1 là Developer");
                break;
            default:
                System.out.println("nhân viên 1 không phải là Developer");
        }

        // Question 8: FOREACH in ra Email, FullName, tên phòng ban của các account
        Account[] accounts = { acc1, acc2, acc3 };
        for (Account acc : accounts) {
            System.out.println("Email: " + acc.getEmail() + ", FullName: " + acc.getFullName() + ", Department: "
                    + (acc.getDepartment() != null ? acc.getDepartment().getDepartmentName() : "Không có"));
        }

        // Question 9: FOREACH in ra id và name của các phòng ban
        Department[] departments = { dep1, dep2, dep3 };
        for (Department dep : departments) {
            System.out.println("Department ID: " + dep.getDepartmaentId() + ", Name: " + dep.getDepartmentName());
        }

        // Question 10: FOR in ra thông tin các account theo định dạng
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full name: " + accounts[i].getFullName());
            System.out.println("Phòng ban: "
                    + (accounts[i].getDepartment() != null ? accounts[i].getDepartment().getDepartmentName()
                            : "Không có"));
        }

        // Question 11: FOR in ra thông tin các phòng ban theo định dạng
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getDepartmaentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
        }

        // Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
        // Question 10
        for (int i = 0; i < 2 && i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getDepartmaentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
        }

        // Question 13: In ra tất cả account ngoại trừ account thứ 2
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1)
                continue;
            System.out.println("Account: " + accounts[i].getUserName());
        }

        // Question 14: In ra tất cả account có id < 4
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountID() < 4) {
                System.out.println("Account có id < 4: " + accounts[i].getUserName());
            }
        }

        // Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Question 16: WHILE làm lại các câu FOR (10-15)
        System.out.println("\nWHILE - Question 10:");
        int i = 0;
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full name: " + accounts[i].getFullName());
            System.out.println("Phòng ban: "
                    + (accounts[i].getDepartment() != null ? accounts[i].getDepartment().getDepartmentName()
                            : "Không có"));
            i++;
        }

        System.out.println("\nWHILE - Question 11:");
        i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getDepartmaentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
            i++;
        }

        System.out.println("\nWHILE - Question 12:");
        i = 0;
        while (i < 2 && i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getDepartmaentId());
            System.out.println("Name: " + departments[i].getDepartmentName());
            i++;
        }

        System.out.println("\nWHILE - Question 13:");
        i = 0;
        while (i < accounts.length) {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Account: " + accounts[i].getUserName());
            i++;
        }

        System.out.println("\nWHILE - Question 14:");
        i = 0;
        while (i < accounts.length) {
            if (accounts[i].getAccountID() >= 4) {
                i++;
                continue;
            }
            System.out.println("Account có id < 4: " + accounts[i].getUserName());
            i++;
        }

        System.out.println("\nWHILE - Question 15:");
        i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        // Question 17: DO-WHILE làm lại các câu FOR (10-15)
        System.out.println("\nDO-WHILE - Question 10:");
        i = 0;
        if (accounts.length > 0)
            do {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].getEmail());
                System.out.println("Full name: " + accounts[i].getFullName());
                System.out.println("Phòng ban: "
                        + (accounts[i].getDepartment() != null ? accounts[i].getDepartment().getDepartmentName()
                                : "Không có"));
                i++;
            } while (i < accounts.length);

        System.out.println("\nDO-WHILE - Question 11:");
        i = 0;
        if (departments.length > 0)
            do {
                System.out.println("Thông tin department thứ " + (i + 1) + " là:");
                System.out.println("Id: " + departments[i].getDepartmaentId());
                System.out.println("Name: " + departments[i].getDepartmentName());
                i++;
            } while (i < departments.length);

        System.out.println("\nDO-WHILE - Question 12:");
        i = 0;
        if (departments.length > 0)
            do {
                if (i >= 2)
                    break;
                System.out.println("Thông tin department thứ " + (i + 1) + " là:");
                System.out.println("Id: " + departments[i].getDepartmaentId());
                System.out.println("Name: " + departments[i].getDepartmentName());
                i++;
            } while (i < departments.length);

        System.out.println("\nDO-WHILE - Question 13:");
        i = 0;
        if (accounts.length > 0)
            do {
                if (i == 1) {
                    i++;
                    continue;
                }
                System.out.println("Account: " + accounts[i].getUserName());
                i++;
            } while (i < accounts.length);

        System.out.println("\nDO-WHILE - Question 14:");
        i = 0;
        if (accounts.length > 0)
            do {
                if (accounts[i].getAccountID() >= 4) {
                    i++;
                    continue;
                }
                System.out.println("Account có id < 4: " + accounts[i].getUserName());
                i++;
            } while (i < accounts.length);

        System.out.println("\nDO-WHILE - Question 15:");
        i = 2;
        if (i <= 20)
            do {
                System.out.print(i + " ");
                i += 2;
            } while (i <= 20);
        System.out.println();
    }
}
