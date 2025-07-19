package com.vti.backend.assignment_4.Exercise_6.Question_1;

public class DemoVietnamesePhone {
    public static void main(String[] args) {
        VietnamesePhone phone = new VietnamesePhone();
        phone.insertContact("Nam", "0123456789");
        phone.insertContact("An", "0987654321");
        phone.insertContact("Nam", "0111111111");
        System.out.println("--- Danh bạ sau khi thêm ---");
        phone.showAllContacts();
        System.out.println("--- Tìm kiếm liên hệ tên 'Nam' ---");
        phone.searchContact("Nam");
        System.out.println("--- Cập nhật số cho 'An' ---");
        phone.updateContact("An", "0222222222");
        phone.showAllContacts();
        System.out.println("--- Xóa liên hệ 'Nam' ---");
        phone.removeContact("Nam");
        phone.showAllContacts();
    }
}