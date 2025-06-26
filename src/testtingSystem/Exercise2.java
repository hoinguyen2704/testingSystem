package testtingSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) {
        // Question 1
        int number1 = 5;
        System.out.printf("Question 1: So nguyen = %d\n", number1);

        // Question 2
        int number2 = 100_000_000;
        System.out.printf("Question 2: %,d\n", number2);

        // Question 3
        double number3 = 5.567098;
        System.out.printf("Question 3: %.4f\n", number3);

        // Question 4
        String name = "Nguyễn Tiến Hội";
        System.out.printf("Question 4: Tên tôi là \"%s\" và tôi đang độc thân.\n", name);

        // Question 5
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH'h':mm'p':ss's'");
        System.out.printf("Question 5: %s\n", sdf.format(now));

        // Question 6: In ra thông tin account theo định dạng table
        System.out.println("Question 6: Thông tin account theo bảng");
        System.out.printf("%-20s %-20s %-20s\n", "Email", "FullName", "Department");
        Account acc1 = new Account(1, "a1@email.com", "user1", "User One", new Department(1, "Sale"), new Position(1, "Dev"), new Date());
        Account acc2 = new Account(2, "a2@email.com", "user2", "User Two", new Department(2, "Marketing"), new Position(2, "Test"), new Date());
        Account acc3 = new Account(3, "a3@email.com", "user3", "User Three", new Department(3, "IT"), new Position(3, "PM"), new Date());
        Account[] accounts = {acc1, acc2, acc3};
        for (Account acc : accounts) {
            System.out.printf("%-20s %-20s %-20s\n", acc.getEmail(), acc.getFullName(), acc.getDepartment() != null ? acc.getDepartment().getDepartmentName() : "Không có");
        }
    }
}
