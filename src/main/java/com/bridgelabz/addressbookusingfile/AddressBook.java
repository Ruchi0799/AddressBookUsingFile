package com.bridgelabz.addressbookusingfile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    public enum I0Service {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
    private static List<AddressBookData> addressBookList;

    public AddressBook() {}

    public AddressBook(List<AddressBookData>
                                           addressBookList) {
        this.addressBookList=addressBookList;

    }

    public static void main(String[] args) {

        addressBookList = new ArrayList<>();

        AddressBook employeePayrollService = new AddressBook (addressBookList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readContactData(consoleInputReader);
        employeePayrollService.writeContactData(IOService.CONSOLE_IO);


    }

    //private void readEmployeePayrollData(Scanner consoleInputReader) {
    private void readContactData(Scanner consoleInputReader) {
//        System.out.println("Enter Employee ID: ");
//        int id= consoleInputReader.nextInt();
//
//        System.out.println("Enter Employee Name: ");
//        String name = consoleInputReader.next();
//
//        System.out.println("Enter Employee Salary: ");
//        double salary = consoleInputReader.nextDouble();

        System.out.println("Enter First name");
        String FirstName = consoleInputReader.next();
        System.out.println("Enter Last name");
        String LastName = consoleInputReader.next();
        System.out.println("Enter address");
        String Address = consoleInputReader.next();
        System.out.println("Enter city");
        String City = consoleInputReader.next();
        System.out.println("Enter state");
        String State = consoleInputReader.next();
        System.out.println("Enter zip code");
        int ZipCode = consoleInputReader.nextInt();
        System.out.println("Enter phone number");
        String PhoneNumber = consoleInputReader.next();
        System.out.println("Enter Email");
        String Email = consoleInputReader.next();

        addressBookList.add(new AddressBookData(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, Email));

    }

    //public void writeEmployeePayrollData(IOService ioService) {
    public void writeContactData(IOService ioService) {

        //System.out.println("\nwriting Employee Payroll Roaster to Console\n" + employeePayrollList);
        if (ioService.equals(IOService.CONSOLE_IO)) {
            System.out.println(addressBookList);
        } else if (ioService.equals(IOService.FILE_IO)) {

            new AddressBookFileIO().writeData(addressBookList);
        }





    }

    public void printData(IOService ioService){
        if (ioService.equals(IOService.FILE_IO))
            new AddressBookFileIO().printData();
    }

    public long countEntries (IOService ioService){
        if (ioService.equals(IOService.FILE_IO))
            return new AddressBookFileIO().countEntries();
        return 0;

    }
}
