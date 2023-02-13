package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scanner.next();
        System.out.println("Enter lastName");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter teh zip/pin code");
        int zip=scanner.nextInt();
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter Phone number");
        String phoneNumber = scanner.next();
        contact.setPhoneNumber(phoneNumber);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setEmail(email);
        contact.setAddress(address);
        contact.setZip(zip);


    }
    public void editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firt name of the contact you want to edit :");
        String searchName = scanner.next();
        if (contact.getFirstName().equalsIgnoreCase(searchName)) {
            System.out.println("Enter firstName");
            String firstName = scanner.next();
            System.out.println("Enter lastName");
            String lastName = scanner.next();
            System.out.println("Enter address");
            String address = scanner.next();
            System.out.println("Enter teh zip/pin code");
            int zip=scanner.nextInt();
            System.out.println("Enter email");
            String email = scanner.next();
            System.out.println("Enter Phone number");

            String phoneNumber = scanner.next();

            Contact contact = new Contact(firstName, lastName,address,zip, email, phoneNumber);
            this.contact = contact;

        }
    }
    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firt name of the contact you want to edit :");
        String searchName = scanner.next();
        if (contact.getFirstName().equalsIgnoreCase(searchName)) {
            contact.setPhoneNumber(null);
            contact.setFirstName(null);
            contact.setLastName(null);
            contact.setEmail(null);
            contact.setAddress(null);
            contact.setZip(0);
        }

    }
}
