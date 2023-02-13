package com.bridgelabz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    //Contact contact = new Contact();
    static List<Contact> Contactlist =new ArrayList<>();
    void AddressBook(Contact contact) {
        //method to add the contacts to adress the list
        Contactlist.add(contact);
    }
    void addContact() {
        //method to add the contacs to the address book
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
        Contact contact =new Contact(firstName, lastName, address, zip, email, phoneNumber);
        AddressBook(contact);

    }
    void EditContact() {
        System.out.println("Enter firstName of the contact do you want to edit");
        String searchName = scanner.next();
        for (Contact j:Contactlist) {
            if (j.getFirstName().equalsIgnoreCase(searchName)) {
                System.out.println("Enter firstName");
                String firstName = scanner.next();
                j.setFirstName(firstName);
                System.out.println("Enter lastName");
                String lastName = scanner.next();
                j.setLastName(lastName);
                System.out.println("Enter address");
                String address = scanner.next();
                j.setAddress(address);
                System.out.println("Enter teh zip/pin code");
                int zip=scanner.nextInt();
                j.setZip(zip);
                System.out.println("Enter email");
                String email = scanner.next();
                j.setEmail(email);
                System.out.println("Enter Phone number");
                String phoneNumber = scanner.next();
                j.setPhoneNumber(phoneNumber);
                Contact contact =new Contact(firstName, lastName, address, zip, email, phoneNumber);

                //AddressBook(contact);
                break;
            }

        }
    }
    void DeleteContact(){
        System.out.println("enter the first name of the contact you want to delete");

        String DeleteName = scanner.next();
        for (Contact j:Contactlist) {
            if (DeleteName.equalsIgnoreCase(j.getFirstName())) {
                System.out.println("matched the contact");
                Contactlist.remove(j);
            }else {
                System.out.println("no ontact present ");
            }

        }}

    void ShowContact() {

        for (Contact i:Contactlist) {
            System.out.println("___-The array list-______");
            System.out.println(i.getFirstName());
            System.out.println(i.getLastName());
            System.out.println(i.getPhoneNumber());
            System.out.println(i.getAddress());
            System.out.println(i.getZip());
            System.out.println();
            System.out.println(i);
        }
    }
}

