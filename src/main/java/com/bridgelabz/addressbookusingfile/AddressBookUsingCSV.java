package com.bridgelabz.addressbookusingfile;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddressBookUsingCSV {
    //public static void writeDataAtOnce(String filePath)
    public static void main(String[] args) {
        writeDataAtOnce();
       // readAllDataAtOnce();
        printData();
    }
    public static void writeDataAtOnce()
    {

        // first create file object for file placed at location
        // specified by filepath
        String AddressbookFile="contactnew-file.csv";
        File file = new File(AddressbookFile);

        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // create a List which contains String array
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"firstName","lastName" ,"address" ,"city","state","zipCode","phoneNumber","email"});
            //data.add(new String[] { "Name", "Class", "Marks" });
            data.add(new String[] { "Ruchi", "Mandve", "Sanpada","Navi Mumbai","Maharashtra","400705","9892735509","ruchi07@" });
            data.add(new String[] { "Prachi", "Mandve", "Vashi","Navi Mumbai","Maharashtra","400703","9967704725","prachi07@"});
            data.add(new String[] { "Preksha", "Mane", "Andheri","Mumbai","Maharashtra","400053","99677056525","preksha07@"});
            writer.writeAll(data);

            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void printData() {

        try {
            Files.lines(new File("contactnew-file.csv").toPath())
                    .forEach(System.out::println);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
