package com.vti.backend.assignment_4.Exercise_6.Question_1;

public class VietnamesePhone extends Phone {
    @Override
    public void insertContact(String name, String phone) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                if (!c.getNumber().equals(phone)) {
                    c.setNumber(c.getNumber() + ":" + phone);
                }
                return;
            }
        }
        contacts.add(new Contact(name, phone));
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newPhone);
                return;
            }
        }
    }

    @Override
    public void searchContact(String name) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy liên hệ với tên: " + name);
        }
    }

    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ rỗng!");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }
} 