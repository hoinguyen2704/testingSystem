package assigment2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import assigment1.*;

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
                // System.out.println("%5.2f", number3);
                Random random = new Random();
                int x = random.nextInt(21) + 20;
                System.out.println("giá trị ngẫu nhiên: " + x);
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
                Account acc1 = new Account(1, "a1@email.com", "user1", "User One", new Department(1, "Sale"),
                                new Position(1, "Dev"), new Date());
                Account acc2 = new Account(2, "a2@email.com", "user2", "User Two", new Department(2, "Marketing"),
                                new Position(2, "Test"), new Date());
                Account acc3 = new Account(3, "a3@email.com", "user3", "User Three", new Department(3, "IT"),
                                new Position(3, "PM"), new Date());
                Account[] accounts = { acc1, acc2, acc3 };
                for (Account acc : accounts) {
                        System.out.printf("%-20s %-20s %-20s\n", acc.getEmail(), acc.getFullName(),
                                        acc.getDepartment() != null ? acc.getDepartment().getDepartmentName()
                                                        : "Không có");
                }

                // Nhập vào tên của bạn và hiển thị
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Nhập tên của bạn: ");
                String ten = scanner.nextLine();
                System.out.println("Tên bạn vừa nhập là: " + ten);

                // Nhập vào 1 chuỗi ngày và in ra theo dateformat
                System.out.print("Nhập vào ngày (dd/MM/yyyy): ");
                String inputDate = scanner.nextLine();
                try {
                        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = inputFormat.parse(inputDate);
                        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        System.out.println("Ngày theo định dạng yyyy-MM-dd: " + outputFormat.format(date));
                } catch (Exception e) {
                        System.out.println("Định dạng ngày không hợp lệ!");
                }
                // Exercise 3: Date Format
                System.out.println("\nExercise 3: Date Format");
                Exam exam1 = new Exam(1, "EX001", "Java Basics", 1, 60, 1, "2024-04-01 15:30:45");
                // Question 1: Format create date (Vietnamese)
                try {
                        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        Date examDate = inputFormat.parse(exam1.getCreateDate());
                        SimpleDateFormat vnFormat = new SimpleDateFormat("dd/MM/yyyy HH'h':mm'p':ss's'");
                        System.out.println("Exam 1 create date (VN): " + vnFormat.format(examDate));
                        // Question 2: Năm-tháng-ngày-giờ-phút-giây
                        SimpleDateFormat fullFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        System.out.println("Exam 1 full: " + fullFormat.format(examDate));
                        // Question 3: Chỉ in ra năm
                        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
                        System.out.println("Exam 1 year: " + yearFormat.format(examDate));
                        // Question 4: Tháng và năm
                        SimpleDateFormat monthYear = new SimpleDateFormat("MM-yyyy");
                        System.out.println("Exam 1 month-year: " + monthYear.format(examDate));
                        // Question 5: MM-DD
                        SimpleDateFormat mmdd = new SimpleDateFormat("MM-dd");
                        System.out.println("Exam 1 MM-DD: " + mmdd.format(examDate));
                } catch (Exception e) {
                        System.out.println("Lỗi định dạng ngày Exam!");
                }

                // Exercise 4: Random Number
                System.out.println("\nExercise 4: Random Number");
                Random rand = new Random();
                // Question 1: Số nguyên ngẫu nhiên
                System.out.println("Random int: " + rand.nextInt());
                // Question 2: Số thực ngẫu nhiên
                System.out.println("Random double: " + rand.nextDouble());
                // Question 3: Random tên trong lớp
                String[] names = { "An", "Bình", "Chi", "Dũng", "Hội" };
                System.out.println("Random name: " + names[rand.nextInt(names.length)]);
                // Question 4: Random ngày trong khoảng
                try {
                        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
                        Date start = sdf2.parse("24-07-1995");
                        Date end = sdf2.parse("20-12-1995");
                        long randomTime = start.getTime()
                                        + (long) (rand.nextDouble() * (end.getTime() - start.getTime()));
                        System.out.println("Random date (24/7-20/12/1995): " + sdf2.format(new Date(randomTime)));
                } catch (Exception e) {
                }
                // Question 5: Random ngày trong 1 năm trở lại
                long nowMillis = System.currentTimeMillis();
                long oneYearMillis = 365L * 24 * 60 * 60 * 1000;
                long randomPast = nowMillis - (long) (rand.nextDouble() * oneYearMillis);
                System.out.println("Random date (1 năm trở lại): " + new Date(randomPast));
                // Question 6: Random ngày trong quá khứ
                long randomPast2 = (long) (rand.nextDouble() * nowMillis);
                System.out.println("Random date (quá khứ): " + new Date(randomPast2));
                // Question 7: Random số có 3 chữ số
                System.out.println("Random 3-digit: " + (rand.nextInt(900) + 100));

                // Exercise 5: Input from console
                System.out.println("\nExercise 5: Input from console");
                // Question 1: Nhập 3 số nguyên
                System.out.print("Nhập 3 số nguyên: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                System.out.println("Bạn đã nhập: " + a + ", " + b + ", " + c);
                // Question 2: Nhập 2 số thực
                System.out.print("Nhập 2 số thực: ");
                double d1 = scanner.nextDouble();
                double d2 = scanner.nextDouble();
                System.out.println("Bạn đã nhập: " + d1 + ", " + d2);
                scanner.nextLine(); // clear buffer
                // Question 3: Nhập họ tên
                System.out.print("Nhập họ tên: ");
                String hoten = scanner.nextLine();
                System.out.println("Họ tên vừa nhập: " + hoten);
                // Question 4: Nhập ngày sinh
                System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
                String ngaysinh = scanner.nextLine();
                System.out.println("Ngày sinh vừa nhập: " + ngaysinh);
                // Question 7: Nhập số chẵn
                System.out.print("Nhập số chẵn: ");
                int sochan = scanner.nextInt();
                if (sochan % 2 == 0)
                        System.out.println("Bạn đã nhập số chẵn: " + sochan);
                else
                        System.out.println("Số nhập không phải số chẵn!");

                // Exercise 6: Method
                System.out.println("\nExercise 6: Method");
                printEvenLessThan10();
                printAccounts(accounts);
                printPositiveLessThan10();
        }

        // Method cho Exercise 6
        public static void printEvenLessThan10() {
                System.out.print("Số chẵn < 10: ");
                for (int i = 2; i < 10; i += 2)
                        System.out.print(i + " ");
                System.out.println();
        }

        public static void printAccounts(Account[] accounts) {
                System.out.println("Thông tin các account:");
                for (Account acc : accounts) {
                        System.out.println(acc.getEmail() + " - " + acc.getFullName());
                }
        }

        public static void printPositiveLessThan10() {
                System.out.print("Số nguyên dương < 10: ");
                for (int i = 1; i < 10; i++)
                        System.out.print(i + " ");
                System.out.println();
        }
}
