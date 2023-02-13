package com.bridgelabz;
public class AddresBookMain {
    public static void main(String[] args) {

        AddressBook addressBook1 = new AddressBook();
        System.out.println("enter the contact person1");
        addressBook1.addContact();
        System.out.println("enter the contact person2");
        addressBook1.addContact();
//		addressBook1.ShowContact();
        System.out.println("------------------");
        addressBook1.EditContact();
//
        addressBook1.ShowContact();
        System.out.println("------------------");
        addressBook1.DeleteContact();
        System.out.println("------------------");
        addressBook1.ShowContact();


//		System.out.println(addressBook1.contact.getPhoneNumber());
//
//		System.out.println(addressBook1.contact.getEmail());
    }
}

