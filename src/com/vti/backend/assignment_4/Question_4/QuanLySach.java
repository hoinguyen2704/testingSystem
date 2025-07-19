package com.vti.backend.assignment_4.Question_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuanLySach {
    private List<TaiLieu> danhSachTaiLieu;

    public QuanLySach() {
        danhSachTaiLieu = new ArrayList<>();
    }

    // a) Thêm mới tài liệu
    public void themTaiLieu(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
    }

    // b) Xóa tài liệu theo mã tài liệu
    public boolean xoaTaiLieuTheoMa(String maTaiLieu) {
        Iterator<TaiLieu> iterator = danhSachTaiLieu.iterator();
        boolean daXoa = false;
        while (iterator.hasNext()) {
            TaiLieu tl = iterator.next();
            if (tl.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
                iterator.remove();
                daXoa = true;
            }
        }
        return daXoa;
    }

    // c) Hiển thị thông tin về tài liệu
    public void hienThiDanhSachTaiLieu() {
        for (TaiLieu tl : danhSachTaiLieu) {
            System.out.println(tl);
        }
    }

    // d) Tìm kiếm tài liệu theo loại
    public void timKiemTheoLoai(Class<?> loai) {
        for (TaiLieu tl : danhSachTaiLieu) {
            if (loai.isInstance(tl)) {
                System.out.println(tl);
            }
        }
    }
} 