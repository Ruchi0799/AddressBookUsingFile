package com.bridgelabz.addressbookusingfile;
import com.google.gson.stream.JsonWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class AddressBookUsingJson {

//        public static void main(String... args) {
//
//        }

    public static void main(String[] args) {
        writeJsonFile();
        readData();
    }
        public static void writeJsonFile()
            {
            String AddressbookFile="contactjson-file.json";
            try(FileWriter fileWriter = new FileWriter(AddressbookFile);
                JsonWriter jsonWriter = new JsonWriter(fileWriter)
            ) {
                jsonWriter.beginObject();
                jsonWriter.name("firstName").value("Ruchi");
                jsonWriter.name("lastName").value("Mandve");
                jsonWriter.name("address").value("Sanpada");
                jsonWriter.name("city").value("NaviMumbai");
                jsonWriter.name("state").value("Maharashtra");
                jsonWriter.name("Pincode").value("400705");
                jsonWriter.name("Phone").value("9892735509");
                jsonWriter.name("email").value("ruchimandve07@gmail.com");
                jsonWriter.endObject();

                System.out.println("Write JSON file successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

  public static void readData()
  {
      try {
          Files.lines(new File("contactjson-file.json").toPath())
                  .forEach(System.out::println);
      }catch(IOException e) {
          e.printStackTrace();
      }
  }
  }


