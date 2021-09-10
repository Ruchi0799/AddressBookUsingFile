package com.bridgelabz.addressbookusingfile;

public class AddressBookData {

    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public int ZipCode;
    public String PhoneNumber;
    public String Email;

    public AddressBookData(String firstName, String lastName, String address, String city, String state, int zipCode, String phoneNumber, String email) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        State = state;
        ZipCode = zipCode;
        PhoneNumber = phoneNumber;
        Email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "AddressBookData{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", ZipCode=" + ZipCode +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
