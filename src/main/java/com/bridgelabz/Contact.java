package com.bridgelabz;

public class Contact {
    //setting the variables for the adress book
    private String firstName;
    private String lastName;
    private String address;
    private int zip;
    private String phoneNumber;
    private String email;

    public Contact() {
    }

    //method to get the detailes
    public Contact(String firstName, String lastName,String address,int zip, String email, String phoneNumber) {
        //arching the encptulation
        this.firstName = firstName;
        this.lastName = lastName;
        this.address=address;
        this.zip=zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

}
