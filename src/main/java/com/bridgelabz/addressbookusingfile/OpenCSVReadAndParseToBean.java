package com.bridgelabz.addressbookusingfile;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;


    public class OpenCSVReadAndParseToBean {
        private static final String SAMPLE_CSV_FILE_PATH = "contactnew-file.csv";
int count1=0;
        //public static void main(String[] args) throws IOException {
        public void readCSV() throws IOException {
            try (
                    Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            ) {
                CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(CSVUser.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();

                Iterator<CSVUser> csvUserIterator = csvToBean.iterator();

                while (csvUserIterator.hasNext()) {
                    count1++;
                    CSVUser csvUser = csvUserIterator.next();


                    System.out.println("FirstName : "+csvUser.getFirstName());
                    System.out.println("LastName : "+csvUser.getLastName());
                    System.out.println("Address:"+csvUser.getAddress());
                    System.out.println("City : "+csvUser.getCity());
                    System.out.println("State : "+csvUser.getState());
                    System.out.println("zipcode : "+csvUser.getZipCode());
                    System.out.println("Phone number : "+csvUser.getPhoneNumber());
                    System.out.println("Email : "+csvUser.getEmail());
                    System.out.println("==========================");
                }
            }
        }

        public int countEntry(){
            return count1;
        }
    }
