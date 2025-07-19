package com.vti.backend.assignment_4.Question_4;

import java.util.Scanner;

public class ProgramQuanLySach {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== QUẢN LÝ TÀI LIỆU =====");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xóa tài liệu theo mã");
            System.out.println("3. Hiển thị danh sách tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Xem tất cả tài liệu");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                continue;
            }
            switch (choice) {
                case 1:
                    themTaiLieu(qls, scanner);
                    break;
                case 2:
                    xoaTaiLieu(qls, scanner);
                    break;
                case 3:
                    qls.hienThiDanhSachTaiLieu();
                    break;
                case 4:
                    timKiemTheoLoai(qls, scanner);
                    break;
                case 5:
                    xemTatCaTaiLieu(qls);
                    break;
                case 6:
                    System.out.println("Đã thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        }
    }

    private static void themTaiLieu(QuanLySach qls, Scanner scanner) {
        System.out.println("Chọn loại tài liệu: 1. Sách  2. Tạp chí  3. Báo");
        int type = -1;
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Loại không hợp lệ!");
            return;
        }
        System.out.print("Mã tài liệu: ");
        String ma = scanner.nextLine();
        System.out.print("Tên nhà xuất bản: ");
        String nxb = scanner.nextLine();
        System.out.print("Số bản phát hành: ");
        int soBan = Integer.parseInt(scanner.nextLine());
        switch (type) {
            case 1:
                System.out.print("Tên tác giả: ");
                String tacGia = scanner.nextLine();
                System.out.print("Số trang: ");
                int soTrang = Integer.parseInt(scanner.nextLine());
                qls.themTaiLieu(new Sach(ma, nxb, soBan, tacGia, soTrang));
                break;
            case 2:
                System.out.print("Số phát hành: ");
                int soPhatHanh = Integer.parseInt(scanner.nextLine());
                System.out.print("Tháng phát hành: ");
                int thangPhatHanh = Integer.parseInt(scanner.nextLine());
                qls.themTaiLieu(new TapChi(ma, nxb, soBan, soPhatHanh, thangPhatHanh));
                break;
            case 3:
                System.out.print("Ngày phát hành: ");
                String ngayPhatHanh = scanner.nextLine();
                qls.themTaiLieu(new Bao(ma, nxb, soBan, ngayPhatHanh));
                break;
            default:
                System.out.println("Loại tài liệu không hợp lệ!");
        }
    }

    private static void xoaTaiLieu(QuanLySach qls, Scanner scanner) {
        System.out.print("Nhập mã tài liệu cần xóa: ");
        String ma = scanner.nextLine();
        boolean daXoa = qls.xoaTaiLieuTheoMa(ma);
        if (daXoa) {
            System.out.println("Đã xóa tài liệu có mã: " + ma);
        } else {
            System.out.println("Không tìm thấy tài liệu để xóa!");
        }
    }

    private static void timKiemTheoLoai(QuanLySach qls, Scanner scanner) {
        System.out.println("Chọn loại tài liệu cần tìm: 1. Sách  2. Tạp chí  3. Báo");
        int type = -1;
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Loại không hợp lệ!");
            return;
        }
        switch (type) {
            case 1:
                System.out.println("Kết quả tìm kiếm Sách:");
                qls.timKiemTheoLoai(Sach.class);
                break;
            case 2:
                System.out.println("Kết quả tìm kiếm Tạp chí:");
                qls.timKiemTheoLoai(TapChi.class);
                break;
            case 3:
                System.out.println("Kết quả tìm kiếm Báo:");
                qls.timKiemTheoLoai(Bao.class);
                break;
            default:
                System.out.println("Loại tài liệu không hợp lệ!");
        }
    }

    private static void xemTatCaTaiLieu(QuanLySach qls) {
        System.out.println("\n--- Danh sách tất cả tài liệu ---");
        qls.hienThiDanhSachTaiLieu();
    }
}