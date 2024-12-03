package com.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookSystem {

    String file = "C:\\Users\\Admin\\Desktop\\Contact.txt";
    List<Contact> list = new ArrayList<>();

    // Reading all the contacts from the file
    public void readAllContacts() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    Contact contact = new Contact(details[0].trim(), details[1].trim(), details[2].trim());
                    list.add(contact);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAllContacts() {
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }

    public void addingContact() {
        list.add(new Contact("Amit", "8001234567", "Chennai"));
        list.add(new Contact("Sonia", "9009876543", "Bangalore"));
        list.add(new Contact("Ravi", "7007654321", "Kolkata"));
    }

    public void printAllContacts2() {
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }

    public void writeAllContactsToFile() {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            for (Contact contact : list) {
                br.write(contact.toString());
                br.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAllContacts3() {
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }



}