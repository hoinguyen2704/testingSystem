package com.vti.frontend;

import com.vti.backend.assignment_4.QLCB;
import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

import java.util.List;
import java.util.Scanner;

public class ProgramExercise5 {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== QUẢN LÝ CÁN BỘ =====");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát");
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
                    themCanBo(qlcb, scanner);
                    break;
                case 2:
                    timKiemCanBo(qlcb, scanner);
                    break;
                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    xoaCanBo(qlcb, scanner);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        }
    }

    private static void themCanBo(QLCB qlcb, Scanner scanner) {
        System.out.println("Chọn loại cán bộ: 1. Công nhân  2. Kỹ sư  3. Nhân viên");
        int type = -1;
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Loại không hợp lệ!");
            return;
        }
        System.out.print("Họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = scanner.nextLine();
        switch (type) {
            case 1:
                System.out.print("Bậc (1-10): ");
                int bac = Integer.parseInt(scanner.nextLine());
                qlcb.themCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                break;
            case 2:
                System.out.print("Ngành đào tạo: ");
                String nganh = scanner.nextLine();
                qlcb.themCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganh));
                break;
            case 3:
                System.out.print("Công việc: ");
                String congViec = scanner.nextLine();
                qlcb.themCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                break;
            default:
                System.out.println("Loại cán bộ không hợp lệ!");
        }
    }

    private static void timKiemCanBo(QLCB qlcb, Scanner scanner) {
        System.out.print("Nhập họ tên cần tìm: ");
        String hoTen = scanner.nextLine();
        List<CanBo> ketQua = qlcb.timKiemTheoHoTen(hoTen);
        if (ketQua.isEmpty()) {
            System.out.println("Không tìm thấy cán bộ nào!");
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (CanBo cb : ketQua) {
                System.out.println(cb);
            }
        }
    }

    private static void xoaCanBo(QLCB qlcb, Scanner scanner) {
        System.out.print("Nhập họ tên cán bộ cần xóa: ");
        String hoTen = scanner.nextLine();
        boolean daXoa = qlcb.xoaCanBoTheoTen(hoTen);
        if (daXoa) {
            System.out.println("Đã xóa cán bộ có tên: " + hoTen);
        } else {
            System.out.println("Không tìm thấy cán bộ để xóa!");
        }
    }
} 