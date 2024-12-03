package com.main;

public class Contact {
    private String name;
    private String phone;
    private String address;

    public Contact(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\"" + name + "\" , \"" + phone + "\" , \"" + address + "\"";
    }
}
