package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        AddressBookSystem abs = new AddressBookSystem();

        System.out.println("Reading all contacts from the file: ");
        abs.readAllContacts();
        abs.printAllContacts();

        System.out.println("\nContacts after adding: ");
        // Adding 3 more contact to list
        abs.addingContact();
        abs.printAllContacts2();

        System.out.println("\nContacts in file: ");
        // Writing all contacts to file
        abs.writeAllContactsToFile();
        abs.printAllContacts3();

    }
}
