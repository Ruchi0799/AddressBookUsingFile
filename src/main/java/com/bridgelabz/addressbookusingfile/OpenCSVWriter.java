package com.bridgelabz.addressbookusingfile;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class OpenCSVWriter {
    private static final String STRING_ARRAY_SAMPLE = "contactnew2-file.csv";
    int count=0;
   // public static void main(String[] args) throws IOException {
    public void writeToCSV() throws IOException {

        try (

                Writer writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE));

                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);
        ) {
            String[] headerRecord = {"firstName", "lastName", "address", "city","state","zipCode","phoneNumber","email"};
            csvWriter.writeNext(headerRecord);

            csvWriter.writeNext(new String[]{"Ruchi", "Mandve", "Sanpada","Navi Mumbai","Maharashtra","400705","9892735509","ruchi07@"});
            count++;
            csvWriter.writeNext(new String[]{"Prachi", "Mandve", "Vashi","Navi Mumbai","Maharashtra","400703","9967704725","prachi07@"});
            count++;
            csvWriter.writeNext(new String[]{"Preksha", "Mane", "Andheri","Mumbai","Maharashtra","400053","99677056525","preksha07@"});
            count++;

        }
    }

    public int countEntries(){
        return count;
    }

//        public long countEntries() {
//            long entries=0;
//            try {
//                entries=Files.lines(new File("contactnew2-file.txt").toPath()).count();
//            }catch(IOException e) {
//                e.printStackTrace();
//            }
//            return entries;
//        }

}
