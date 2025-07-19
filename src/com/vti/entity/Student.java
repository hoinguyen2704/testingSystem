package com.vti.entity;

public class Student {
    // a) Tất cả các property sẽ để là private để các class khác không chỉnh sửa hay
    // nhìn thấy
    private static int idCounter = 1;
    private int id;
    private String name;
    private String hometown;
    private float diemHocLuc;

    // b) Tạo constructor cho phép khi khởi tạo mỗi student thì người dùng sẽ nhập
    // vào tên, hometown và có điểm học lực = 0
    public Student(String name, String hometown) {
        this.id = idCounter++;
        this.name = name;
        this.hometown = hometown;
        this.diemHocLuc = 0;
    }

    // c) Tạo 1 method cho phép set điểm vào
    public void setDiemHocLuc(float diem) {
        this.diemHocLuc = diem;
    }

    // d) Tạo 1 method cho phép cộng thêm điểm
    public void congDiem(float diemCongThem) {
        this.diemHocLuc += diemCongThem;
    }

    // e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực
    // và học lực
    @Override
    public String toString() {
        String hocLuc = null;
        if (diemHocLuc < 4.0f) {
            hocLuc = "Yếu";
        } else if (diemHocLuc < 6.0f) {
            hocLuc = "Trung bình";
        } else if (diemHocLuc < 8.0f) {
            hocLuc = "Khá";
        } else {
            hocLuc = "Giỏi";
        }
        return "Student{" +
                "id: " + this.id + "Tên: " + this.name + ", Quê quán: " + this.hometown + ", Điểm: " + this.diemHocLuc
                + ", Học lực: " + hocLuc +
                '}';
    }

    // Getter cho id, name, hometown, diemHocLuc nếu cần thiết
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public float getDiemHocLuc() {
        return diemHocLuc;
    }
}
