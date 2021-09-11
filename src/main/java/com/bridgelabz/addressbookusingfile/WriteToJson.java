package com.bridgelabz.addressbookusingfile;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import org.arpit.java2blog.pojo.Country;
import com.google.gson.Gson;
public class WriteToJson {
    public static void main(String[] args) {

        AddressBookUsingJsonObject countryObj=new AddressBookUsingJsonObject();
        countryObj.setFirstName("Ruchi");
        countryObj.setLastName("Mandve");
        countryObj.setAddress("Sanpada");
        countryObj.setCity("Navi Mumbai");
        countryObj.setState("Maharashtra");
        countryObj.setZipCode(400705);
        countryObj.setPhoneNumber("9892735509");
        countryObj.setEmail("ruchimandve07@gmail.com");

        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(countryObj);

        try {
            //write converted json data to a file named "CountryGSON.json"
            FileWriter writer = new FileWriter("contactjson1.json");
            writer.write(json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);

    }
}
