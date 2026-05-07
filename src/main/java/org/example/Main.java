package org.example;

import org.example.models.Grocery;
import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // GROCERY TEST
        // Grocery.startGrocery();

        // MOBILE PHONE TEST
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("John Doe", "123123123"));
        contacts.add(new Contact("Jane Doe", "124124124"));
        contacts.add(new Contact("Baby Doe", "125125125"));

        MobilePhone mobilePhone = new MobilePhone("11111111", contacts);

        mobilePhone.addNewContact(new Contact("Test", "999999"));
        mobilePhone.printContacts();
    }
}