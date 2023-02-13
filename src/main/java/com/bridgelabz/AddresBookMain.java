package com.bridgelabz;

import Com.BridgeLabs.AddressBook;
public class AddresBookMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact();
        System.out.println("--------------------");
        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhoneNumber());

        System.out.println(addressBook1.contact.getEmail());

        addressBook1.editContact();
        System.out.println("------=edited=---------");

        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhoneNumber());

        System.out.println(addressBook1.contact.getEmail());

        addressBook1.deleteContact();

        System.out.println("------=deleted=---------");

        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getAddress());
        System.out.println(addressBook1.contact.getZip());
        System.out.println(addressBook1.contact.getPhoneNumber());

        System.out.println(addressBook1.contact.getEmail());
    }

}
