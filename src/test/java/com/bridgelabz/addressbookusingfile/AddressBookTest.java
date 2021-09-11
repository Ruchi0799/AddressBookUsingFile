package com.bridgelabz.addressbookusingfile;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

//import com.bridgelabz.employeepayrollusingfile.EmployeePayrollData;
//import com.bridgelabz.employeepayrollusingfile.EmployeePayrollService;
import com.bridgelabz.addressbookusingfile.IOService;
public class AddressBookTest {
    @Test
    public void givenContactWhenWrittenToFileShouldMatchContactEntries() {
            AddressBookData[] arrayOfAds= {
                new AddressBookData("ruchi","Mandve","Sanpada","NaviMumbai","Maha",400,"989273509","ruchimandve@"),
                new AddressBookData("prachi","Mandve","Sanpada","NaviMumbai","Maha",400,"989273509","ruchimandve@"),
                new AddressBookData("pratibha","Mandve","Sanpada","NaviMumbai","Maha",400,"989273509","ruchimandve@")
        };
        AddressBook addressBook;
        addressBook=new AddressBook(Arrays.asList(arrayOfAds));
        addressBook.writeContactData(com.bridgelabz.addressbookusingfile.IOService.FILE_IO);
        addressBook.printData(com.bridgelabz.addressbookusingfile.IOService.FILE_IO);
        long entries=addressBook.countEntries(com.bridgelabz.addressbookusingfile.IOService.FILE_IO);
        Assert.assertEquals(3, entries);

    }

    @Test
    public void givenData_mustAddInCsv_AndReturnCount() throws IOException {
        OpenCSVWriter openCSVWriter=new OpenCSVWriter();
        openCSVWriter.writeToCSV();
        Assert.assertEquals(3,openCSVWriter.countEntries());

    }

    @Test
    public void givenData_mustreadDataInCsv_AndReturnCount() throws IOException {
        OpenCSVReadAndParseToBean openCSVReadAndParseToBean=new OpenCSVReadAndParseToBean();
        openCSVReadAndParseToBean.readCSV();
        Assert.assertEquals(3,openCSVReadAndParseToBean.countEntry());
    }
}
