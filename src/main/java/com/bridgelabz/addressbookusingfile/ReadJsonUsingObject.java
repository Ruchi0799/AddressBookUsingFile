package com.bridgelabz.addressbookusingfile;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonUsingObject {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try {

            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");

            BufferedReader br = new BufferedReader(
                    new FileReader("contactjson1.json"));

            //convert the json string back to object
            AddressBookUsingJsonObject countryObj = gson.fromJson(br, AddressBookUsingJsonObject.class);

            System.out.println("FirstName : "+countryObj.getFirstName());
            System.out.println("LastName : "+countryObj.getLastName());
            System.out.println("Address:"+countryObj.getAddress());
            System.out.println("City : "+countryObj.getCity());
            System.out.println("State : "+countryObj.getState());
            System.out.println("zipcode : "+countryObj.getZipCode());
            System.out.println("Phone number : "+countryObj.getPhoneNumber());
            System.out.println("Email : "+countryObj.getEmail());



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
