package com.vti.backend.assignment_4;

import com.vti.entity.CanBo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QLCB {
    private List<CanBo> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    // a) Thêm mới cán bộ
    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    // b) Tìm kiếm theo họ tên
    public List<CanBo> timKiemTheoHoTen(String hoTen) {
        List<CanBo> ketQua = new ArrayList<>();
        for (CanBo cb : danhSachCanBo) {
            if (cb.getHoTen().equalsIgnoreCase(hoTen)) {
                ketQua.add(cb);
            }
        }
        return ketQua;
    }

    // c) Hiển thị thông tin về danh sách các cán bộ
    public void hienThiDanhSachCanBo() {
        for (CanBo cb : danhSachCanBo) {
            System.out.println(cb);
        }
    }

    // d) Xóa cán bộ theo tên
    public boolean xoaCanBoTheoTen(String hoTen) {
        Iterator<CanBo> iterator = danhSachCanBo.iterator();
        boolean daXoa = false;
        while (iterator.hasNext()) {
            CanBo cb = iterator.next();
            if (cb.getHoTen().equalsIgnoreCase(hoTen)) {
                iterator.remove();
                daXoa = true;
            }
        }
        return daXoa;
    }
} 