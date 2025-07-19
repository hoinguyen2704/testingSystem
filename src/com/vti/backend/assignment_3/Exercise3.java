package com.vti.backend.assignment_3;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exercise 1: Datatype Casting
        // Question 1
        float salary1 = 5240.5f;
        float salary2 = 10970.055f;
        int salary1Int = (int) salary1;
        int salary2Int = (int) salary2;
        System.out.println("Lương Account 1 làm tròn: " + salary1Int);
        System.out.println("Lương Account 2 làm tròn: " + salary2Int);

        // Question 2
        int random5 = new Random().nextInt(100000);
        System.out.printf("Số ngẫu nhiên 5 chữ số: %05d\n", random5);

        // Question 3
        // Cách 1
        String random5Str = String.format("%05d", random5);
        System.out.println("2 số cuối (String): " + random5Str.substring(3));
        // Cách 2
        System.out.println("2 số cuối (mod 100): " + (random5 % 100));

        // Question 4
        System.out.print("Nhập 2 số nguyên a, b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Thương a/b = " + divide(a, b));

        // Exercise 2: Default value
        // Question 1
        Account[] accounts = new Account[5];
        for (int i = 0; i < 5; i++) {
            accounts[i] = new Account("Email " + (i + 1), "User name " + (i + 1), "Full name " + (i + 1), new Date());
        }
        for (Account acc : accounts) {
            System.out.println(acc);
        }

        // Exercise 3: Boxing & Unboxing
        // Question 1
        Integer luong = 5000;
        float luongFloat = luong.floatValue();
        System.out.printf("Lương float: %.2f\n", luongFloat);
        // Question 2
        String strNum = "1234567";
        int num = Integer.parseInt(strNum);
        System.out.println("String sang int: " + num);
        // Question 3
        Integer numObj = Integer.valueOf("1234567");
        int num2 = numObj.intValue();
        System.out.println("Integer sang int: " + num2);

        // Exercise 4: String
        // Question 1
        scanner.nextLine(); // clear buffer
        System.out.print("Nhập xâu kí tự: ");
        String s = scanner.nextLine();
        String[] words = s.trim().split("\\s+");
        System.out.println("Số từ: " + words.length);
        // Question 2
        System.out.print("Nhập s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập s2: ");
        String s2 = scanner.nextLine();
        System.out.println("Kết quả nối: " + s1 + s2);
        // Question 3
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();
        if (!ten.isEmpty() && !Character.isUpperCase(ten.charAt(0))) {
            ten = Character.toUpperCase(ten.charAt(0)) + ten.substring(1);
        }
        System.out.println("Tên sau chuẩn hóa: " + ten);
        // Question 4
        System.out.print("Nhập tên để in từng ký tự: ");
        String ten2 = scanner.nextLine();
        for (int i = 0; i < ten2.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + ten2.charAt(i));
        }
        // Question 5
        System.out.print("Nhập họ: ");
        String ho = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String ten3 = scanner.nextLine();
        System.out.println("Họ và tên đầy đủ: " + ho + " " + ten3);
        // Question 6
        System.out.print("Nhập họ và tên đầy đủ: ");
        String hoten = scanner.nextLine();
        String[] parts = hoten.trim().split(" ");
        if (parts.length >= 3) {
            System.out.println("Họ là: " + parts[0]);
            System.out.println("Tên đệm là: " + parts[1]);
            System.out.println("Tên là: " + parts[2]);
        }
        // ... (các câu tiếp theo có thể bổ sung tương tự)
        scanner.close();
    }

    public static double divide(int a, int b) {
        if (b == 0)
            return 0;
        return (double) a / b;
    }
}

// Account class mẫu cho bài tập
class Account {
    String email;
    String username;
    String fullname;
    Date createDate;

    public Account(String email, String username, String fullname, Date createDate) {
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.createDate = createDate;
    }

    public String toString() {
        return email + " - " + username + " - " + fullname + " - " + createDate;
    }
}
